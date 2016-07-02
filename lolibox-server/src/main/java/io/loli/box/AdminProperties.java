package io.loli.box;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * @author choco
 */
@ConfigurationProperties("admin")
public class AdminProperties {
    @NotNull
    private String email;

    private boolean anonymous = false;

    private boolean signupInvitation = true;

    private String invitationSeed = "lolibox";

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isSignupInvitation() {
        return signupInvitation;
    }

    public void setSignupInvitation(boolean signupInvitation) {
        this.signupInvitation = signupInvitation;
    }

    public String getInvitationSeed() {
        return invitationSeed;
    }

    public void setInvitationSeed(String invitationSeed) {
        this.invitationSeed = invitationSeed;
    }
}