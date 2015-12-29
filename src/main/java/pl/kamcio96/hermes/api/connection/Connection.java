package pl.kamcio96.hermes.api.connection;

import net.md_5.bungee.protocol.DefinedPacket;

import java.net.InetSocketAddress;

public interface Connection {

    InetSocketAddress getAddress();

    Unsafe unsafe();

    interface Unsafe {

        void sendPacket(DefinedPacket packet);
    }
}
