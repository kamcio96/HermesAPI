package pl.kamcio96.hermes.api.connection;

import pl.kamcio96.hermes.api.Callback;
import pl.kamcio96.hermes.api.CommandSource;
import pl.kamcio96.hermes.api.ServerData;

import java.util.UUID;

public interface Player extends Connection, CommandSource {

    UUID getUniqueId();

    Server getServer();

    void connect(ServerData data);

    void connect(ServerData data, Callback<Boolean> callback);

    @Override
    PlayerUnsafe unsafe();

    interface PlayerUnsafe extends Unsafe {

        void connectWithoutDimensionSwitch(ServerData data);

        void connectWithoutDimensionSwitch(ServerData data, Callback<Boolean> callback);
    }
}
