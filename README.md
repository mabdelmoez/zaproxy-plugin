# zaproxy-plugin
It's a Jenkins plugin that allows to start and execute the OWASP ZAP security tool (https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project).
With this plugin, you can spider and scan a target URL, save alerts security reports in all available formats in ZAProxy (xml, html, json) and also load and save ZAP sessions.

This plugin uses an external plugin to install ZAProxy on the machine with Jenkins (like Custom Tools Plugin) or ZAProxy must be already install before run builds. 
