/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ce2336hw71;

/**
 *
 * @author aksfjh
 */
public abstract class AbstractTree<E> implements Tree<E> {
  @Override /** Inorder traversal from the root*/
  public void inorder() {
  }

  @Override /** Postorder traversal from the root */
  public void postorder() {
  }

  @Override /** Preorder traversal from the root */
  public void preorder() {
  }

  @Override /** Return true if the tree is empty */
  public boolean isEmpty() {
    return getSize() == 0;
  }
//
//  @Override BLOCKCOMMENT* Return an iterator for the tree */
//  public java.util.Iterator<E> iterator() {
//    return null;
//  }
}