package pl.kamcio96.hermes.api.plugin;

import java.util.logging.Logger;

public interface PluginContainer {

    String getName();

    String getVersion();

    Plugin getData();

    Logger getLogger();

    Object getInstance();
}
