#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package};

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class AppTest {
    
    @Test
    public void junit_and_hamcrest_work() {
        assertThat(true, is(true));
    }
    
    
    @Test
    public void mockito_works() {
        List myList = mock(List.class);
        when(myList.isEmpty()).thenReturn(Boolean.TRUE);
        
        myList.isEmpty();
        
        verify(myList).isEmpty();
    }
}