package my.edu.tarc.sciencepark;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.twizo.Twizo;
import com.twizo.controllers.verification.VerificationController;
import com.twizo.dataaccess.jsonparams.VerificationParams;
import com.twizo.exceptions.TwizoException;
import com.twizo.models.Verification;

class VerificationExample {
    private final VerificationController verificationController;

    VerificationExample(Twizo twizo) {
        this.verificationController = twizo.getVerificationController();
    }

    Verification createVerification(String recipient) throws TwizoException {
        VerificationParams params = new VerificationParams();
        params.setRecipient(recipient);
        return this.verificationController.createVerification(params);
    }

    Verification verifyToken(String messageId, String token) throws TwizoException {
        return this.verificationController.verifyToken(messageId, token);
    }

    Verification getVerificationStatus(String messageId) throws TwizoException {
        return this.verificationController.getVerificationStatus(messageId);
    }
}
