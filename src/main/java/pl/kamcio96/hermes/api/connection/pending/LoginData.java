package pl.kamcio96.hermes.api.connection.pending;

import java.util.UUID;

public interface LoginData extends HandshakeData {

    String getName();

    boolean getOnlineMode();

    void setOnlineMode(boolean onlineMode);

    void setUniqueId(UUID uniqueId);

}
