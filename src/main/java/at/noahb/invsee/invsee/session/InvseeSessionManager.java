package at.noahb.invsee.invsee.session;

import at.noahb.invsee.InvseePlugin;
import at.noahb.invsee.common.session.SessionManager;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public class InvseeSessionManager extends SessionManager {

    public InvseeSessionManager(InvseePlugin instance) {
        super(instance);
    }

    @Override
    public void createSession(OfflinePlayer offlinePlayer, UUID subscriber) {
        InvseeSession invseeSession = new InvseeSession(offlinePlayer, subscriber);
        addSession(invseeSession);
    }

}
