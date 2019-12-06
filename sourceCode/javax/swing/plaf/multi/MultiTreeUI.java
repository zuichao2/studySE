/*
 * Copyright (c) 1997, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package javax.swing.plaf.multi;

import javax.accessibility.Accessible;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.TreeUI;
import javax.swing.tree.TreePath;
import java.util.Vector;

/**
 * A multiplexing UI used to combine <code>TreeUI</code>s.
 *
 * <p>This file was automatically generated by AutoMulti.
 *
 * @author  Otto Multey
 */
public class MultiTreeUI extends TreeUI {

    /**
     * The vector containing the real UIs.  This is populated
     * in the call to <code>createUI</code>, and can be obtained by calling
     * the <code>getUIs</code> method.  The first element is guaranteed to be the real UI
     * obtained from the default look and feel.
     */
    protected Vector uis = new Vector();

////////////////////
// Common UI methods
////////////////////

    /**
     * Returns the list of UIs associated with this multiplexing UI.  This
     * allows processing of the UIs by an application aware of multiplexing
     * UIs on components.
     */
    public ComponentUI[] getUIs() {
        return MultiLookAndFeel.uisToArray(uis);
    }

////////////////////
// TreeUI methods
////////////////////

    /**
     * Invokes the <code>getPathBounds</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public Rectangle getPathBounds(JTree a, TreePath b) {
        Rectangle returnValue =
            ((TreeUI) (uis.elementAt(0))).getPathBounds(a,b);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).getPathBounds(a,b);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getPathForRow</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public TreePath getPathForRow(JTree a, int b) {
        TreePath returnValue =
            ((TreeUI) (uis.elementAt(0))).getPathForRow(a,b);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).getPathForRow(a,b);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getRowForPath</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public int getRowForPath(JTree a, TreePath b) {
        int returnValue =
            ((TreeUI) (uis.elementAt(0))).getRowForPath(a,b);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).getRowForPath(a,b);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getRowCount</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public int getRowCount(JTree a) {
        int returnValue =
            ((TreeUI) (uis.elementAt(0))).getRowCount(a);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).getRowCount(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getClosestPathForLocation</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public TreePath getClosestPathForLocation(JTree a, int b, int c) {
        TreePath returnValue =
            ((TreeUI) (uis.elementAt(0))).getClosestPathForLocation(a,b,c);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).getClosestPathForLocation(a,b,c);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>isEditing</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public boolean isEditing(JTree a) {
        boolean returnValue =
            ((TreeUI) (uis.elementAt(0))).isEditing(a);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).isEditing(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>stopEditing</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public boolean stopEditing(JTree a) {
        boolean returnValue =
            ((TreeUI) (uis.elementAt(0))).stopEditing(a);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).stopEditing(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>cancelEditing</code> method on each UI handled by this object.
     */
    public void cancelEditing(JTree a) {
        for (int i = 0; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).cancelEditing(a);
        }
    }

    /**
     * Invokes the <code>startEditingAtPath</code> method on each UI handled by this object.
     */
    public void startEditingAtPath(JTree a, TreePath b) {
        for (int i = 0; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).startEditingAtPath(a,b);
        }
    }

    /**
     * Invokes the <code>getEditingPath</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public TreePath getEditingPath(JTree a) {
        TreePath returnValue =
            ((TreeUI) (uis.elementAt(0))).getEditingPath(a);
        for (int i = 1; i < uis.size(); i++) {
            ((TreeUI) (uis.elementAt(i))).getEditingPath(a);
        }
        return returnValue;
    }

////////////////////
// ComponentUI methods
////////////////////

    /**
     * Invokes the <code>contains</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public boolean contains(JComponent a, int b, int c) {
        boolean returnValue =
            ((ComponentUI) (uis.elementAt(0))).contains(a,b,c);
        for (int i = 1; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).contains(a,b,c);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>update</code> method on each UI handled by this object.
     */
    public void update(Graphics a, JComponent b) {
        for (int i = 0; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).update(a,b);
        }
    }

    /**
     * Returns a multiplexing UI instance if any of the auxiliary
     * <code>LookAndFeel</code>s supports this UI.  Otherwise, just returns the
     * UI object obtained from the default <code>LookAndFeel</code>.
     */
    public static ComponentUI createUI(JComponent a) {
        ComponentUI mui = new MultiTreeUI();
        return MultiLookAndFeel.createUIs(mui,
                                          ((MultiTreeUI) mui).uis,
                                          a);
    }

    /**
     * Invokes the <code>installUI</code> method on each UI handled by this object.
     */
    public void installUI(JComponent a) {
        for (int i = 0; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).installUI(a);
        }
    }

    /**
     * Invokes the <code>uninstallUI</code> method on each UI handled by this object.
     */
    public void uninstallUI(JComponent a) {
        for (int i = 0; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).uninstallUI(a);
        }
    }

    /**
     * Invokes the <code>paint</code> method on each UI handled by this object.
     */
    public void paint(Graphics a, JComponent b) {
        for (int i = 0; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).paint(a,b);
        }
    }

    /**
     * Invokes the <code>getPreferredSize</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public Dimension getPreferredSize(JComponent a) {
        Dimension returnValue =
            ((ComponentUI) (uis.elementAt(0))).getPreferredSize(a);
        for (int i = 1; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).getPreferredSize(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getMinimumSize</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public Dimension getMinimumSize(JComponent a) {
        Dimension returnValue =
            ((ComponentUI) (uis.elementAt(0))).getMinimumSize(a);
        for (int i = 1; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).getMinimumSize(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getMaximumSize</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public Dimension getMaximumSize(JComponent a) {
        Dimension returnValue =
            ((ComponentUI) (uis.elementAt(0))).getMaximumSize(a);
        for (int i = 1; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).getMaximumSize(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getAccessibleChildrenCount</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public int getAccessibleChildrenCount(JComponent a) {
        int returnValue =
            ((ComponentUI) (uis.elementAt(0))).getAccessibleChildrenCount(a);
        for (int i = 1; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).getAccessibleChildrenCount(a);
        }
        return returnValue;
    }

    /**
     * Invokes the <code>getAccessibleChild</code> method on each UI handled by this object.
     *
     * @return the value obtained from the first UI, which is
     * the UI obtained from the default <code>LookAndFeel</code>
     */
    public Accessible getAccessibleChild(JComponent a, int b) {
        Accessible returnValue =
            ((ComponentUI) (uis.elementAt(0))).getAccessibleChild(a,b);
        for (int i = 1; i < uis.size(); i++) {
            ((ComponentUI) (uis.elementAt(i))).getAccessibleChild(a,b);
        }
        return returnValue;
    }
}
