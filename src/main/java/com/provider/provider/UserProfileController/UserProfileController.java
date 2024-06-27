package com.provider.provider.UserProfileController;

import com.provider.provider.UserProfile.UserProfile;
import com.provider.provider.UserProfileService.UserProfileService;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/userprofile")
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping
    public ResponseEntity<UserProfile> createUserProfile(
            @RequestParam("gender") String gender,
            @RequestParam("firstname") String firstname,
            @RequestParam("middlename") String middlename,
            @RequestParam("lastname") String lastname,
            @RequestParam("address") String address,
            @RequestParam("phonenumber") long phonenumber,
            @RequestParam("aadharnumber") long aadharnumber,
            @RequestParam("serviceslist") String serviceslist,
            @RequestParam("companyname") String companyname,
            @RequestParam("emailid") String emailid,
            @RequestParam("servicename") String servicename,
            @RequestParam("companydescription") String companydescription,
            @RequestParam("pincode") long pincode,
            @RequestParam("experience") long experience,
            @RequestParam("profilephoto") MultipartFile profilephoto,
            @RequestParam("adharphoto") MultipartFile adharphoto,
            @RequestParam("panphoto") MultipartFile panphoto) {

        UserProfile userProfile = new UserProfile();
        userProfile.setGender(gender);
        userProfile.setFirstname(firstname);
        userProfile.setMiddlename(middlename);
        userProfile.setLastname(lastname);
        userProfile.setAddress(address);
        userProfile.setPhonenumber(phonenumber);
        userProfile.setAadharnumber(aadharnumber);
        userProfile.setServiceslist(serviceslist);
        userProfile.setCompanyname(companyname);
        userProfile.setEmailid(emailid);
        userProfile.setServicename(servicename);
        userProfile.setCompanydescription(companydescription);
        userProfile.setPincode(pincode);
        userProfile.setExperience(experience);

        try {
            // Validate and convert profilephoto
            BufferedImage profileImage = ImageIO.read(profilephoto.getInputStream());
            if (profileImage == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            ByteArrayOutputStream profileBaos = new ByteArrayOutputStream();
            String profileContentType = profilephoto.getContentType();
            ImageIO.write(profileImage, profileContentType.substring(profileContentType.indexOf('/') + 1), profileBaos);
            userProfile.setProfilephoto(profileBaos.toByteArray());

            // Validate and convert adharphoto
            BufferedImage adharImage = ImageIO.read(adharphoto.getInputStream());
            if (adharImage == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            ByteArrayOutputStream adharBaos = new ByteArrayOutputStream();
            String adharContentType = adharphoto.getContentType();
            ImageIO.write(adharImage, adharContentType.substring(adharContentType.indexOf('/') + 1), adharBaos);
            userProfile.setAdharphoto(adharBaos.toByteArray());

            // Validate and convert panphoto
            BufferedImage panImage = ImageIO.read(panphoto.getInputStream());
            if (panImage == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            ByteArrayOutputStream panBaos = new ByteArrayOutputStream();
            String panContentType = panphoto.getContentType();
            ImageIO.write(panImage, panContentType.substring(panContentType.indexOf('/') + 1), panBaos);
            userProfile.setPanphoto(panBaos.toByteArray());
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        UserProfile savedUserProfile = userProfileService.saveUserProfile(userProfile);
        return new ResponseEntity<>(savedUserProfile, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable Long id) {
        Optional<UserProfile> userProfile = userProfileService.getUserProfileById(id);
        return userProfile.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public List<UserProfile> getAllUserProfiles() {
        return userProfileService.getAllUserProfiles();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserProfile(@PathVariable Long id) {
        userProfileService.deleteUserProfile(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
