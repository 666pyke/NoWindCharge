# NoWindCharge - Restrict WindCharge Usage! 🌬️
## Overview
**NoWindCharge** is a Minecraft plugin designed to restrict the usage and effects of the Wind Charge item in your server. Whether you're looking to **disable it entirely** or prevent its usage in **specific regions**, NoWindCharge provides you with the tools to maintain a balanced gameplay experience.

# Features
**Complete Disable Option**: Option to completely disable Wind Charge usage and explosions server-wide.
**Region-Based Restrictions**: Prevent players from using Wind Charge or triggering its explosions in specific WorldGuard regions.
**Custom Message**s: Fully configurable messages to notify players when their action is blocked.
**Bypass Permissions**: Allow admins or specific players to bypass restrictions.
**Reload Command**: Easily reload the plugin's configuration without restarting the server.

# How It Works
**Complete Disable Mod**e: When enabled, all Wind Charge usage and explosions are blocked globally.
**Region Restrictions**: If complete disable mode is off, restrictions apply only within WorldGuard regions listed in the configuration.

# Commands
**/nowindcharge reload** - Reloads the plugin configuration.
Permissions
**nowindcharge.bypass** - Allows players to bypass Wind Charge restrictions.
**nowindcharge.reload** - Allows admins to reload the plugin configuration.

# Configuration

```yml 
disable-completely: false
excluded-regions:
  - spawn
  - arena
deny-message: "&cYou cannot use Wind Charge in region &e%region%&c!"
completely-disabled-message: "&cWind Charge usage is completely disabled on this server!"
reload-message: "&aConfiguration reloaded successfully!"
no-permission-message: "&cYou don't have permission to use this command!"
startup-message: "&aNoWindCharge has been enabled!"
shutdown-message: "&cNoWindCharge has been disabled!"
```

