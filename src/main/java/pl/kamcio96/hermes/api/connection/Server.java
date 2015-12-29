package pl.kamcio96.hermes.api.connection;

import pl.kamcio96.hermes.api.ServerData;

import java.util.Collection;

public interface Server extends Connection {

    ServerData getData();

    Collection<Player> getPlayers();
}
