package tools.vlab;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestCompletion;
import io.vertx.ext.unit.TestOptions;
import io.vertx.ext.unit.TestSuite;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.report.ReportOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import tools.vlab.alpha.extension.repoconnector.repository.model.Organisation;

/**
 * Unit test for simple App.
 */
@RunWith(VertxUnitRunner.class)
public class MusterTest extends TestCase {

    @Test
    public void testMuster() {

        final Vertx vertx = Vertx.vertx();
        TestSuite gitlabTestSuite = TestSuite.create("Test the Service");
        GitLabRepositoryService service = new GitLabRepositoryService(vertx);

        // Test Case 1
        githubTestSuite.test("Execute Tests", context -> {
            Async async = context.async();

            // Test Your Code

            async.awaitSuccess(4000);
        });

        ReportOptions consoleReport = new ReportOptions().setTo("console");
        TestOptions options = new TestOptions();
        options.setTimeout(10000);
        options.addReporter(consoleReport);

        TestCompletion completion = githubTestSuite.run(options);
        completion.handler(voidAsyncResult -> {
            if (voidAsyncResult.succeeded()) {
                System.out.println("Test Done ...");
            } else {
                System.out.println("Test failed...");
                voidAsyncResult.cause().printStackTrace();
            }
        });
        completion.await();
    }

}
