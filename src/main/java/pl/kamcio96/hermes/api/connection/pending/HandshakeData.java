package pl.kamcio96.hermes.api.connection.pending;

import java.net.InetSocketAddress;

public interface HandshakeData {

    int getVersion();

    InetSocketAddress getVirtualHost();

    boolean isLegacy();

}
