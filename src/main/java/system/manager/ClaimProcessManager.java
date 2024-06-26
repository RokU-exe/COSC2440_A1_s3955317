/**
 * @author <Le Xuan Loc - s3955317>
 */

package system.manager;


import system.model.Claim;
import java.util.List;

/**
 * Interface for managing the claim processes in the insurance system.
 */
public interface ClaimProcessManager {
    void addClaim(Claim claim);

    void updateClaim(String claimId, Claim updatedClaim);

    boolean deleteClaim(String claimId);

    Claim getOne(String claimId);

    List<Claim> getAll();
}