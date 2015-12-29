package pl.kamcio96.hermes.api;

import java.net.InetSocketAddress;

public interface ProxyConfig {

    int getMaxPlayers();

    void setMaxPlayers(int maxPlayers);

    InetSocketAddress getListenHost();

    boolean isOnlineMode();

    void setOnlineMode(boolean onlineMode);

}
