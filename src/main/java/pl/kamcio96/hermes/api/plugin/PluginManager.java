package pl.kamcio96.hermes.api.plugin;

import java.io.File;
import java.io.InputStream;

public interface PluginManager {

    PluginContainer getPlugin(String name);

    void loadPlugins(File directory);

    void loadPlugin(File file);

    void loadPlugin(InputStream inputStream);

    // TODO commands, listeners, events
}
