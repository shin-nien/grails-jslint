class JslintGrailsPlugin {
    // the plugin version
    def version = "0.5"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]
    
    def scopes = [excludes:'war']

    def author = "James Miller"
    def authorEmail = "jamesmiller01@gmail.com"
    def title = "JsLint for Grails"
    def description = '''A Grails command line script to run JsLint on javascript files.
There is also an option to produce html reports.
    '''

    def issueManagement = [system: 'github', url: "https://github.com/millerjam/grails-jslint/issues"]
    def scm = [url: "https://github.com/millerjam/grails-jslint"]
    def license = "APACHE"
    def developers = [
            [ name: "James Miller" ],
            [ name: "Jeff Beck" ]
    ]

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/jslint"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
