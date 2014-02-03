#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class AppFixture {

	public String statelessCheck(String firstName, String secondName) {
            return String.format("Hello %s %s !", firstName, secondName);
	}
        
        
        public void reset() {
            //Reset prevoius state
        }
        
	public String statefullCheck(String time, String command) {
            return String.format("%s - %s", time, command);
	}
}
