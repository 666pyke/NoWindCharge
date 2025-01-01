# NoWindCharge - Restrict WindCharge Usage! 🌬️
## Overview
NoWindCharge is a Minecraft plugin designed to restrict the usage and effects of the Wind Charge item in your server. Whether you're looking to disable it entirely or prevent its usage in specific regions, NoWindCharge provides you with the tools to maintain a balanced gameplay experience. Ideal for servers that need fine-tuned control over Wind Charge mechanics.

# Features
Complete Disable Option: Option to completely disable Wind Charge usage and explosions server-wide.
Region-Based Restrictions: Prevent players from using Wind Charge or triggering its explosions in specific WorldGuard regions.
Custom Messages: Fully configurable messages to notify players when their action is blocked.
Bypass Permissions: Allow admins or specific players to bypass restrictions.
Reload Command: Easily reload the plugin's configuration without restarting the server.

# How It Works
Complete Disable Mode: When enabled, all Wind Charge usage and explosions are blocked globally.
Region Restrictions: If complete disable mode is off, restrictions apply only within WorldGuard regions listed in the configuration.
Blocked Actions:
Using Wind Charge from both main hand and offhand.
Explosions caused by Wind Charge are canceled if the conditions are met.
Customizable: Modify blocked regions, messages, and cooldowns directly in config.yml.

# Commands
/nowindcharge reload - Reloads the plugin configuration.
Permissions
nowindcharge.bypass - Allows players to bypass Wind Charge restrictions.
nowindcharge.reload - Allows admins to reload the plugin configuration.
Configuration
Here's an example of what you can configure in config.yml:

yaml
Copy code
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
