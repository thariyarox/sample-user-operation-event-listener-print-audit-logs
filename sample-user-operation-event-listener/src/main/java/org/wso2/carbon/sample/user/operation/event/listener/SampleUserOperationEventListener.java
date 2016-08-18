package org.wso2.carbon.sample.user.operation.event.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.context.CarbonContext;
import org.wso2.carbon.user.api.Permission;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.common.AbstractUserOperationEventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleUserOperationEventListener extends AbstractUserOperationEventListener {

    //private static Log log = LogFactory.getLog(SampleUserOperationEventListener.class);

    private static final Log audit = CarbonConstants.AUDIT_LOG;
    private static String AUDIT_MESSAGE = "Initiator : %s | Action : %s | Target : %s ";

    @Override
    public int getExecutionOrderId() {

        //This listener should execute before the IdentityMgtEventListener
        //Hence the number should be < 1357 (Execution order ID of IdentityMgtEventListener)
        return 1356;
    }


    @Override
    public boolean doPreAuthenticate(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {

        //return super.doPreAuthenticate(userName, credential, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreAuthenticate", userName));
        return true;
    }

    @Override
    public boolean doPostAuthenticate(String userName, boolean authenticated, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostAuthenticate(userName, authenticated, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostAuthenticate", userName));
        return true;
    }

    @Override
    public boolean doPreAddUser(String userName, Object credential, String[] roleList, Map<String, String> claims, String profile, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreAddUser(userName, credential, roleList, claims, profile, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreAddUser", userName));
        return true;
    }

    @Override
    public boolean doPostAddUser(String userName, Object credential, String[] roleList, Map<String, String> claims, String profile, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostAddUser(userName, credential, roleList, claims, profile, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostAddUser", userName));
        return true;
    }

    @Override
    public boolean doPreUpdateCredential(String userName, Object newCredential, Object oldCredential, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreUpdateCredential(userName, newCredential, oldCredential, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateCredential", userName));
        return true;
    }

    @Override
    public boolean doPostUpdateCredential(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostUpdateCredential(userName, credential, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateCredential", userName));
        return true;
    }

    @Override
    public boolean doPreUpdateCredentialByAdmin(String userName, Object newCredential, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreUpdateCredentialByAdmin(userName, newCredential, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateCredentialByAdmin", userName));
        return true;
    }

    @Override
    public boolean doPostUpdateCredentialByAdmin(String userName, Object credential, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostUpdateCredentialByAdmin(userName, credential, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateCredentialByAdmin", userName));
        return true;
    }

    @Override
    public boolean doPreDeleteUser(String userName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreDeleteUser(userName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteUser", userName));
        return true;
    }

    @Override
    public boolean doPostDeleteUser(String userName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostDeleteUser(userName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteUser", userName));
        return true;
    }

    @Override
    public boolean doPreSetUserClaimValue(String userName, String claimURI, String claimValue, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreSetUserClaimValue(userName, claimURI, claimValue, profileName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreSetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPostSetUserClaimValue(String userName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostSetUserClaimValue(userName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostSetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPreSetUserClaimValues(String userName, Map<String, String> claims, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreSetUserClaimValues(userName, claims, profileName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreSetUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPostSetUserClaimValues(String userName, Map<String, String> claims, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostSetUserClaimValues(userName, claims, profileName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostSetUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPreDeleteUserClaimValues(String userName, String[] claims, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreDeleteUserClaimValues(userName, claims, profileName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPostDeleteUserClaimValues(String userName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostDeleteUserClaimValues(userName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPreDeleteUserClaimValue(String userName, String claimURI, String profileName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreDeleteUserClaimValue(userName, claimURI, profileName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPostDeleteUserClaimValue(String userName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostDeleteUserClaimValue(userName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPreAddRole(String roleName, String[] userList, Permission[] permissions, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreAddRole(roleName, userList, permissions, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreAddRole", roleName));
        return true;
    }

    @Override
    public boolean doPostAddRole(String roleName, String[] userList, Permission[] permissions, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostAddRole(roleName, userList, permissions, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostAddRole", roleName));
        return true;
    }

    @Override
    public boolean doPreDeleteRole(String roleName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreDeleteRole(roleName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteRole", roleName));
        return true;
    }

    @Override
    public boolean doPostDeleteRole(String roleName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostDeleteRole(roleName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteRole", roleName));
        return true;
    }

    @Override
    public boolean doPreUpdateRoleName(String roleName, String newRoleName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreUpdateRoleName(roleName, newRoleName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateRoleName", roleName));
        return true;
    }

    @Override
    public boolean doPostUpdateRoleName(String roleName, String newRoleName, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostUpdateRoleName(roleName, newRoleName, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateRoleName", roleName));
        return true;
    }

    @Override
    public boolean doPreUpdateUserListOfRole(String roleName, String[] deletedUsers, String[] newUsers, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreUpdateUserListOfRole(roleName, deletedUsers, newUsers, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateUserListOfRole", roleName));
        return true;
    }

    @Override
    public boolean doPostUpdateUserListOfRole(String roleName, String[] deletedUsers, String[] newUsers, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostUpdateUserListOfRole(roleName, deletedUsers, newUsers, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateUserListOfRole", roleName));
        return true;
    }

    @Override
    public boolean doPreUpdateRoleListOfUser(String userName, String[] deletedRoles, String[] newRoles, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPreUpdateRoleListOfUser(userName, deletedRoles, newRoles, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateRoleListOfUser", userName));
        return true;
    }

    @Override
    public boolean doPostUpdateRoleListOfUser(String userName, String[] deletedRoles, String[] newRoles, UserStoreManager userStoreManager) throws UserStoreException {
        //return super.doPostUpdateRoleListOfUser(userName, deletedRoles, newRoles, userStoreManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateRoleListOfUser", userName));
        return true;
    }

    @Override
    public boolean doPreGetUserClaimValue(String userName, String claim, String profileName, UserStoreManager storeManager) throws UserStoreException {
        //return super.doPreGetUserClaimValue(userName, claim, profileName, storeManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreGetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPreGetUserClaimValues(String userName, String[] claims, String profileName, Map<String, String> claimMap, UserStoreManager storeManager) throws UserStoreException {
        //return super.doPreGetUserClaimValues(userName, claims, profileName, claimMap, storeManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreGetUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPostGetUserClaimValue(String userName, String claim, List<String> claimValue, String profileName, UserStoreManager storeManager) throws UserStoreException {
        //return super.doPostGetUserClaimValue(userName, claim, claimValue, profileName, storeManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostGetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPostGetUserClaimValues(String userName, String[] claims, String profileName, Map<String, String> claimMap, UserStoreManager storeManager) throws UserStoreException {
        //return super.doPostGetUserClaimValues(userName, claims, profileName, claimMap, storeManager);
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostGetUserClaimValues", userName));
        return true;
    }

    /**
     * Get the logged in user's username who is calling the operation
     * @return username
     */

    private String getUser() {
        return CarbonContext.getThreadLocalCarbonContext().getUsername() + "@" +
                CarbonContext.getThreadLocalCarbonContext().getTenantDomain();
    }
}
