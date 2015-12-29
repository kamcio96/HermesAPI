package pl.kamcio96.hermes.api;

import net.md_5.bungee.api.chat.BaseComponent;

import java.util.Collection;

public interface CommandSource {

    String getName();

    void sendMessage(String message);

    void sendMessage(BaseComponent component);

    void sendMessage(BaseComponent[] components);

    boolean hasPermission(String permission);

    Collection<String> getPermissions();
}
