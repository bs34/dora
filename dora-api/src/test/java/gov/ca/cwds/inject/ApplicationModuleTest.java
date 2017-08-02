package gov.ca.cwds.inject;

import static org.junit.Assert.assertNotNull;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

/**
 * @author CWDS API Team
 */
public class ApplicationModuleTest {

  private ApplicationModule module;

  @Before
  public void init() throws Exception {
    module = new ApplicationModule();
  }

  @Test
  public void testConfigure() throws Exception {
    Injector injector = Guice.createInjector(module);
    ApplicationModule applicationModule = injector.getInstance(ApplicationModule.class);
    assertNotNull(applicationModule);
  }
}