const ShowDeviceTypesCommand = require('./commands/showdevicetypes')
const ShowSdksCommand = require('./commands/showsdks')
const InstallCommand = require('./commands/install')
const LaunchCommand = require('./commands/launch')
const StartCommand = require('./commands/start')
const LegacyFunctions = require('./index.legacy')

module.exports = {
  ...LegacyFunctions,
  // see above legacy functions for usage
  ShowDeviceTypesCommand,
  ShowSdksCommand,
  InstallCommand,
  LaunchCommand,
  StartCommand
}
