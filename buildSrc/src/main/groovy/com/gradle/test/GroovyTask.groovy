import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import Code

class GroovyTask extends DefaultTask
{
    @Input GroovyVersion version
    @Input Code code

    @TaskAction
    void start() {
        print "GroovyTask run ${version.toString()} $code"
    }
}