package trie;

import org.junit.Test;
import vec.util.*

import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by kenny on 6/6/16.
 */
class TrieTest {
    val d = Double.POSITIVE_INFINITY

    @Test
    fun stringTrie() {
        val trie = Trie<String, Any?>()
        assertFalse(trie.contains(*emptyArray()))

        trie.add(d, "a", "b", "c")
        assertFalse(trie.contains( "a" ))
        assertFalse(trie.contains( "a", "b" ))
        assertTrue(trie.contains( "a", "b", "c" ))

        trie.add(d,"a", "b")
        assertTrue(trie.contains( "a", "b" ))

        trie.add( d,"a", "b", "d", "e")
        assertTrue(trie.contains( "a", "b", "d", "e" ))
    }

    @Test
    fun charTrie() {
        val trie = Trie<Char, Any?>()
        assertFalse(trie.contains(*emptyArray()))

        trie.add(d, 'a', 'b', 'c')
        assertFalse(trie.contains('a'))
        assertFalse(trie.contains('a', 'b'))
        assertTrue(trie.contains('a', 'b', 'c'))

        trie.add(d, 'a', 'b')
        assertTrue(trie.contains('a', 'b'))

        trie.add(d, 'a', 'b', 'd', 'e')
        assertTrue(trie.contains('a', 'b', 'd', 'e'))
    }

    @Test
    fun intTrie() {
        val trie = Trie<Int, Any?>()
        assertFalse(trie.contains(*emptyArray()))

        trie.add(d, 1, 2, 3)
        assertFalse(trie.contains(  1))
        assertFalse(trie.contains(  1, 2))
        assertTrue(trie.contains( 1, 2, 3))

        trie.add(d, 1, 2)
        assertTrue(trie.contains(1,2))

        trie.add(d,  1, 2, 4, 5)
        assertTrue(trie.contains( 1, 2, 4, 5 ))
    }
}
