/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.oym.widgets;

import java.beans.*;

/**
 *
 * @author Administrator
 */
public class JPopupMenuBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( py.com.oym.widgets.JPopupMenu.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoscrolls = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_border = 9;
    private static final int PROPERTY_borderPainted = 10;
    private static final int PROPERTY_bounds = 11;
    private static final int PROPERTY_colorModel = 12;
    private static final int PROPERTY_component = 13;
    private static final int PROPERTY_componentAtIndex = 14;
    private static final int PROPERTY_componentCount = 15;
    private static final int PROPERTY_componentListeners = 16;
    private static final int PROPERTY_componentOrientation = 17;
    private static final int PROPERTY_componentPopupMenu = 18;
    private static final int PROPERTY_components = 19;
    private static final int PROPERTY_containerListeners = 20;
    private static final int PROPERTY_cursor = 21;
    private static final int PROPERTY_cursorSet = 22;
    private static final int PROPERTY_debugGraphicsOptions = 23;
    private static final int PROPERTY_displayable = 24;
    private static final int PROPERTY_doubleBuffered = 25;
    private static final int PROPERTY_dropTarget = 26;
    private static final int PROPERTY_enabled = 27;
    private static final int PROPERTY_focusable = 28;
    private static final int PROPERTY_focusCycleRoot = 29;
    private static final int PROPERTY_focusCycleRootAncestor = 30;
    private static final int PROPERTY_focusListeners = 31;
    private static final int PROPERTY_focusOwner = 32;
    private static final int PROPERTY_focusTraversable = 33;
    private static final int PROPERTY_focusTraversalKeys = 34;
    private static final int PROPERTY_focusTraversalKeysEnabled = 35;
    private static final int PROPERTY_focusTraversalPolicy = 36;
    private static final int PROPERTY_focusTraversalPolicyProvider = 37;
    private static final int PROPERTY_focusTraversalPolicySet = 38;
    private static final int PROPERTY_font = 39;
    private static final int PROPERTY_fontSet = 40;
    private static final int PROPERTY_foreground = 41;
    private static final int PROPERTY_foregroundSet = 42;
    private static final int PROPERTY_graphics = 43;
    private static final int PROPERTY_graphicsConfiguration = 44;
    private static final int PROPERTY_height = 45;
    private static final int PROPERTY_hierarchyBoundsListeners = 46;
    private static final int PROPERTY_hierarchyListeners = 47;
    private static final int PROPERTY_ignoreRepaint = 48;
    private static final int PROPERTY_inheritsPopupMenu = 49;
    private static final int PROPERTY_inputContext = 50;
    private static final int PROPERTY_inputMap = 51;
    private static final int PROPERTY_inputMethodListeners = 52;
    private static final int PROPERTY_inputMethodRequests = 53;
    private static final int PROPERTY_inputVerifier = 54;
    private static final int PROPERTY_insets = 55;
    private static final int PROPERTY_invoker = 56;
    private static final int PROPERTY_keyListeners = 57;
    private static final int PROPERTY_label = 58;
    private static final int PROPERTY_layout = 59;
    private static final int PROPERTY_lightweight = 60;
    private static final int PROPERTY_lightWeightPopupEnabled = 61;
    private static final int PROPERTY_locale = 62;
    private static final int PROPERTY_location = 63;
    private static final int PROPERTY_locationOnScreen = 64;
    private static final int PROPERTY_managingFocus = 65;
    private static final int PROPERTY_margin = 66;
    private static final int PROPERTY_maximumSize = 67;
    private static final int PROPERTY_maximumSizeSet = 68;
    private static final int PROPERTY_menuKeyListeners = 69;
    private static final int PROPERTY_minimumSize = 70;
    private static final int PROPERTY_minimumSizeSet = 71;
    private static final int PROPERTY_mouseListeners = 72;
    private static final int PROPERTY_mouseMotionListeners = 73;
    private static final int PROPERTY_mousePosition = 74;
    private static final int PROPERTY_mouseWheelListeners = 75;
    private static final int PROPERTY_name = 76;
    private static final int PROPERTY_nextFocusableComponent = 77;
    private static final int PROPERTY_opaque = 78;
    private static final int PROPERTY_optimizedDrawingEnabled = 79;
    private static final int PROPERTY_paintingForPrint = 80;
    private static final int PROPERTY_paintingTile = 81;
    private static final int PROPERTY_parent = 82;
    private static final int PROPERTY_peer = 83;
    private static final int PROPERTY_popupMenuListeners = 84;
    private static final int PROPERTY_popupSize = 85;
    private static final int PROPERTY_preferredSize = 86;
    private static final int PROPERTY_preferredSizeSet = 87;
    private static final int PROPERTY_propertyChangeListeners = 88;
    private static final int PROPERTY_registeredKeyStrokes = 89;
    private static final int PROPERTY_requestFocusEnabled = 90;
    private static final int PROPERTY_rootPane = 91;
    private static final int PROPERTY_selected = 92;
    private static final int PROPERTY_selectionModel = 93;
    private static final int PROPERTY_showing = 94;
    private static final int PROPERTY_size = 95;
    private static final int PROPERTY_subElements = 96;
    private static final int PROPERTY_toolkit = 97;
    private static final int PROPERTY_toolTipText = 98;
    private static final int PROPERTY_topLevelAncestor = 99;
    private static final int PROPERTY_transferHandler = 100;
    private static final int PROPERTY_treeLock = 101;
    private static final int PROPERTY_UI = 102;
    private static final int PROPERTY_UIClassID = 103;
    private static final int PROPERTY_valid = 104;
    private static final int PROPERTY_validateRoot = 105;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 106;
    private static final int PROPERTY_vetoableChangeListeners = 107;
    private static final int PROPERTY_visible = 108;
    private static final int PROPERTY_visibleRect = 109;
    private static final int PROPERTY_width = 110;
    private static final int PROPERTY_x = 111;
    private static final int PROPERTY_y = 112;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[113];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", py.com.oym.widgets.JPopupMenu.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", py.com.oym.widgets.JPopupMenu.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", py.com.oym.widgets.JPopupMenu.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", py.com.oym.widgets.JPopupMenu.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", py.com.oym.widgets.JPopupMenu.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", py.com.oym.widgets.JPopupMenu.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", py.com.oym.widgets.JPopupMenu.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", py.com.oym.widgets.JPopupMenu.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", py.com.oym.widgets.JPopupMenu.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", py.com.oym.widgets.JPopupMenu.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_borderPainted] = new PropertyDescriptor ( "borderPainted", py.com.oym.widgets.JPopupMenu.class, "isBorderPainted", "setBorderPainted" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", py.com.oym.widgets.JPopupMenu.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", py.com.oym.widgets.JPopupMenu.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new PropertyDescriptor ( "component", py.com.oym.widgets.JPopupMenu.class, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentAtIndex] = new IndexedPropertyDescriptor ( "componentAtIndex", py.com.oym.widgets.JPopupMenu.class, null, null, "getComponentAtIndex", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", py.com.oym.widgets.JPopupMenu.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", py.com.oym.widgets.JPopupMenu.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", py.com.oym.widgets.JPopupMenu.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", py.com.oym.widgets.JPopupMenu.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", py.com.oym.widgets.JPopupMenu.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", py.com.oym.widgets.JPopupMenu.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", py.com.oym.widgets.JPopupMenu.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", py.com.oym.widgets.JPopupMenu.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", py.com.oym.widgets.JPopupMenu.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", py.com.oym.widgets.JPopupMenu.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", py.com.oym.widgets.JPopupMenu.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", py.com.oym.widgets.JPopupMenu.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", py.com.oym.widgets.JPopupMenu.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", py.com.oym.widgets.JPopupMenu.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", py.com.oym.widgets.JPopupMenu.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", py.com.oym.widgets.JPopupMenu.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", py.com.oym.widgets.JPopupMenu.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", py.com.oym.widgets.JPopupMenu.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", py.com.oym.widgets.JPopupMenu.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", py.com.oym.widgets.JPopupMenu.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", py.com.oym.widgets.JPopupMenu.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", py.com.oym.widgets.JPopupMenu.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", py.com.oym.widgets.JPopupMenu.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", py.com.oym.widgets.JPopupMenu.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", py.com.oym.widgets.JPopupMenu.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", py.com.oym.widgets.JPopupMenu.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", py.com.oym.widgets.JPopupMenu.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", py.com.oym.widgets.JPopupMenu.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", py.com.oym.widgets.JPopupMenu.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", py.com.oym.widgets.JPopupMenu.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", py.com.oym.widgets.JPopupMenu.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", py.com.oym.widgets.JPopupMenu.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", py.com.oym.widgets.JPopupMenu.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", py.com.oym.widgets.JPopupMenu.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", py.com.oym.widgets.JPopupMenu.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", py.com.oym.widgets.JPopupMenu.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", py.com.oym.widgets.JPopupMenu.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", py.com.oym.widgets.JPopupMenu.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", py.com.oym.widgets.JPopupMenu.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", py.com.oym.widgets.JPopupMenu.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", py.com.oym.widgets.JPopupMenu.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_invoker] = new PropertyDescriptor ( "invoker", py.com.oym.widgets.JPopupMenu.class, "getInvoker", "setInvoker" ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", py.com.oym.widgets.JPopupMenu.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_label] = new PropertyDescriptor ( "label", py.com.oym.widgets.JPopupMenu.class, "getLabel", "setLabel" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", py.com.oym.widgets.JPopupMenu.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", py.com.oym.widgets.JPopupMenu.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_lightWeightPopupEnabled] = new PropertyDescriptor ( "lightWeightPopupEnabled", py.com.oym.widgets.JPopupMenu.class, "isLightWeightPopupEnabled", "setLightWeightPopupEnabled" ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", py.com.oym.widgets.JPopupMenu.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", py.com.oym.widgets.JPopupMenu.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", py.com.oym.widgets.JPopupMenu.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", py.com.oym.widgets.JPopupMenu.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", py.com.oym.widgets.JPopupMenu.class, "getMargin", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", py.com.oym.widgets.JPopupMenu.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", py.com.oym.widgets.JPopupMenu.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menuKeyListeners] = new PropertyDescriptor ( "menuKeyListeners", py.com.oym.widgets.JPopupMenu.class, "getMenuKeyListeners", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", py.com.oym.widgets.JPopupMenu.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", py.com.oym.widgets.JPopupMenu.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", py.com.oym.widgets.JPopupMenu.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", py.com.oym.widgets.JPopupMenu.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", py.com.oym.widgets.JPopupMenu.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", py.com.oym.widgets.JPopupMenu.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", py.com.oym.widgets.JPopupMenu.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", py.com.oym.widgets.JPopupMenu.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", py.com.oym.widgets.JPopupMenu.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", py.com.oym.widgets.JPopupMenu.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", py.com.oym.widgets.JPopupMenu.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", py.com.oym.widgets.JPopupMenu.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", py.com.oym.widgets.JPopupMenu.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", py.com.oym.widgets.JPopupMenu.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_popupMenuListeners] = new PropertyDescriptor ( "popupMenuListeners", py.com.oym.widgets.JPopupMenu.class, "getPopupMenuListeners", null ); // NOI18N
            properties[PROPERTY_popupSize] = new PropertyDescriptor ( "popupSize", py.com.oym.widgets.JPopupMenu.class, null, "setPopupSize" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", py.com.oym.widgets.JPopupMenu.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", py.com.oym.widgets.JPopupMenu.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", py.com.oym.widgets.JPopupMenu.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", py.com.oym.widgets.JPopupMenu.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", py.com.oym.widgets.JPopupMenu.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", py.com.oym.widgets.JPopupMenu.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selected] = new PropertyDescriptor ( "selected", py.com.oym.widgets.JPopupMenu.class, null, "setSelected" ); // NOI18N
            properties[PROPERTY_selectionModel] = new PropertyDescriptor ( "selectionModel", py.com.oym.widgets.JPopupMenu.class, "getSelectionModel", "setSelectionModel" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", py.com.oym.widgets.JPopupMenu.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", py.com.oym.widgets.JPopupMenu.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_subElements] = new PropertyDescriptor ( "subElements", py.com.oym.widgets.JPopupMenu.class, "getSubElements", null ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", py.com.oym.widgets.JPopupMenu.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", py.com.oym.widgets.JPopupMenu.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", py.com.oym.widgets.JPopupMenu.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", py.com.oym.widgets.JPopupMenu.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", py.com.oym.widgets.JPopupMenu.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", py.com.oym.widgets.JPopupMenu.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", py.com.oym.widgets.JPopupMenu.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", py.com.oym.widgets.JPopupMenu.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", py.com.oym.widgets.JPopupMenu.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", py.com.oym.widgets.JPopupMenu.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", py.com.oym.widgets.JPopupMenu.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", py.com.oym.widgets.JPopupMenu.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", py.com.oym.widgets.JPopupMenu.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", py.com.oym.widgets.JPopupMenu.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", py.com.oym.widgets.JPopupMenu.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", py.com.oym.widgets.JPopupMenu.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_menuKeyListener = 8;
    private static final int EVENT_mouseListener = 9;
    private static final int EVENT_mouseMotionListener = 10;
    private static final int EVENT_mouseWheelListener = 11;
    private static final int EVENT_popupMenuListener = 12;
    private static final int EVENT_propertyChangeListener = 13;
    private static final int EVENT_vetoableChangeListener = 14;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[15];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_menuKeyListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "menuKeyListener", javax.swing.event.MenuKeyListener.class, new String[] {"menuKeyTyped", "menuKeyPressed", "menuKeyReleased"}, "addMenuKeyListener", "removeMenuKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_popupMenuListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "popupMenuListener", javax.swing.event.PopupMenuListener.class, new String[] {"popupMenuWillBecomeVisible", "popupMenuWillBecomeInvisible", "popupMenuCanceled"}, "addPopupMenuListener", "removePopupMenuListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JPopupMenu.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_add8 = 8;
    private static final int METHOD_add9 = 9;
    private static final int METHOD_addNotify10 = 10;
    private static final int METHOD_addPropertyChangeListener11 = 11;
    private static final int METHOD_addSeparator12 = 12;
    private static final int METHOD_applyComponentOrientation13 = 13;
    private static final int METHOD_areFocusTraversalKeysSet14 = 14;
    private static final int METHOD_bounds15 = 15;
    private static final int METHOD_checkImage16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_computeVisibleRect18 = 18;
    private static final int METHOD_contains19 = 19;
    private static final int METHOD_contains20 = 20;
    private static final int METHOD_countComponents21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createImage23 = 23;
    private static final int METHOD_createToolTip24 = 24;
    private static final int METHOD_createVolatileImage25 = 25;
    private static final int METHOD_createVolatileImage26 = 26;
    private static final int METHOD_deliverEvent27 = 27;
    private static final int METHOD_disable28 = 28;
    private static final int METHOD_dispatchEvent29 = 29;
    private static final int METHOD_doLayout30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enableInputMethods33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_getActionForKeyStroke44 = 44;
    private static final int METHOD_getBaseline45 = 45;
    private static final int METHOD_getBounds46 = 46;
    private static final int METHOD_getClientProperty47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentAt49 = 49;
    private static final int METHOD_getComponentIndex50 = 50;
    private static final int METHOD_getComponentZOrder51 = 51;
    private static final int METHOD_getConditionForKeyStroke52 = 52;
    private static final int METHOD_getDefaultLightWeightPopupEnabled53 = 53;
    private static final int METHOD_getDefaultLocale54 = 54;
    private static final int METHOD_getFocusTraversalKeys55 = 55;
    private static final int METHOD_getFontMetrics56 = 56;
    private static final int METHOD_getInsets57 = 57;
    private static final int METHOD_getListeners58 = 58;
    private static final int METHOD_getLocation59 = 59;
    private static final int METHOD_getMousePosition60 = 60;
    private static final int METHOD_getPopupLocation61 = 61;
    private static final int METHOD_getPropertyChangeListeners62 = 62;
    private static final int METHOD_getSize63 = 63;
    private static final int METHOD_getToolTipLocation64 = 64;
    private static final int METHOD_getToolTipText65 = 65;
    private static final int METHOD_gotFocus66 = 66;
    private static final int METHOD_grabFocus67 = 67;
    private static final int METHOD_handleEvent68 = 68;
    private static final int METHOD_hasFocus69 = 69;
    private static final int METHOD_hide70 = 70;
    private static final int METHOD_imageUpdate71 = 71;
    private static final int METHOD_insert72 = 72;
    private static final int METHOD_insert73 = 73;
    private static final int METHOD_insets74 = 74;
    private static final int METHOD_inside75 = 75;
    private static final int METHOD_invalidate76 = 76;
    private static final int METHOD_isAncestorOf77 = 77;
    private static final int METHOD_isFocusCycleRoot78 = 78;
    private static final int METHOD_isLightweightComponent79 = 79;
    private static final int METHOD_isPopupTrigger80 = 80;
    private static final int METHOD_keyDown81 = 81;
    private static final int METHOD_keyUp82 = 82;
    private static final int METHOD_layout83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_list85 = 85;
    private static final int METHOD_list86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_locate89 = 89;
    private static final int METHOD_location90 = 90;
    private static final int METHOD_lostFocus91 = 91;
    private static final int METHOD_menuSelectionChanged92 = 92;
    private static final int METHOD_minimumSize93 = 93;
    private static final int METHOD_mouseDown94 = 94;
    private static final int METHOD_mouseDrag95 = 95;
    private static final int METHOD_mouseEnter96 = 96;
    private static final int METHOD_mouseExit97 = 97;
    private static final int METHOD_mouseMove98 = 98;
    private static final int METHOD_mouseUp99 = 99;
    private static final int METHOD_move100 = 100;
    private static final int METHOD_nextFocus101 = 101;
    private static final int METHOD_pack102 = 102;
    private static final int METHOD_paint103 = 103;
    private static final int METHOD_paintAll104 = 104;
    private static final int METHOD_paintComponents105 = 105;
    private static final int METHOD_paintImmediately106 = 106;
    private static final int METHOD_paintImmediately107 = 107;
    private static final int METHOD_postEvent108 = 108;
    private static final int METHOD_preferredSize109 = 109;
    private static final int METHOD_prepareImage110 = 110;
    private static final int METHOD_prepareImage111 = 111;
    private static final int METHOD_print112 = 112;
    private static final int METHOD_printAll113 = 113;
    private static final int METHOD_printComponents114 = 114;
    private static final int METHOD_processKeyEvent115 = 115;
    private static final int METHOD_processMouseEvent116 = 116;
    private static final int METHOD_putClientProperty117 = 117;
    private static final int METHOD_registerKeyboardAction118 = 118;
    private static final int METHOD_registerKeyboardAction119 = 119;
    private static final int METHOD_remove120 = 120;
    private static final int METHOD_remove121 = 121;
    private static final int METHOD_remove122 = 122;
    private static final int METHOD_removeAll123 = 123;
    private static final int METHOD_removeNotify124 = 124;
    private static final int METHOD_removePropertyChangeListener125 = 125;
    private static final int METHOD_repaint126 = 126;
    private static final int METHOD_repaint127 = 127;
    private static final int METHOD_repaint128 = 128;
    private static final int METHOD_repaint129 = 129;
    private static final int METHOD_repaint130 = 130;
    private static final int METHOD_requestDefaultFocus131 = 131;
    private static final int METHOD_requestFocus132 = 132;
    private static final int METHOD_requestFocus133 = 133;
    private static final int METHOD_requestFocusInWindow134 = 134;
    private static final int METHOD_resetKeyboardActions135 = 135;
    private static final int METHOD_reshape136 = 136;
    private static final int METHOD_resize137 = 137;
    private static final int METHOD_resize138 = 138;
    private static final int METHOD_revalidate139 = 139;
    private static final int METHOD_scrollRectToVisible140 = 140;
    private static final int METHOD_setBounds141 = 141;
    private static final int METHOD_setComponentZOrder142 = 142;
    private static final int METHOD_setDefaultLightWeightPopupEnabled143 = 143;
    private static final int METHOD_setDefaultLocale144 = 144;
    private static final int METHOD_show145 = 145;
    private static final int METHOD_show146 = 146;
    private static final int METHOD_show147 = 147;
    private static final int METHOD_size148 = 148;
    private static final int METHOD_toString149 = 149;
    private static final int METHOD_transferFocus150 = 150;
    private static final int METHOD_transferFocusBackward151 = 151;
    private static final int METHOD_transferFocusDownCycle152 = 152;
    private static final int METHOD_transferFocusUpCycle153 = 153;
    private static final int METHOD_unregisterKeyboardAction154 = 154;
    private static final int METHOD_update155 = 155;
    private static final int METHOD_updateUI156 = 156;
    private static final int METHOD_validate157 = 157;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[158];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("add", new Class[] {javax.swing.JMenuItem.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_add8] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("add", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_add8].setDisplayName ( "" );
            methods[METHOD_add9] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("add", new Class[] {javax.swing.Action.class})); // NOI18N
            methods[METHOD_add9].setDisplayName ( "" );
            methods[METHOD_addNotify10] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify10].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener11] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener11].setDisplayName ( "" );
            methods[METHOD_addSeparator12] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("addSeparator", new Class[] {})); // NOI18N
            methods[METHOD_addSeparator12].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation13] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation13].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet14] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet14].setDisplayName ( "" );
            methods[METHOD_bounds15] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds15].setDisplayName ( "" );
            methods[METHOD_checkImage16] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect18] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect18].setDisplayName ( "" );
            methods[METHOD_contains19] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains19].setDisplayName ( "" );
            methods[METHOD_contains20] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains20].setDisplayName ( "" );
            methods[METHOD_countComponents21] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents21].setDisplayName ( "" );
            methods[METHOD_createImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage22].setDisplayName ( "" );
            methods[METHOD_createImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage23].setDisplayName ( "" );
            methods[METHOD_createToolTip24] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip24].setDisplayName ( "" );
            methods[METHOD_createVolatileImage25] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage25].setDisplayName ( "" );
            methods[METHOD_createVolatileImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage26].setDisplayName ( "" );
            methods[METHOD_deliverEvent27] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent27].setDisplayName ( "" );
            methods[METHOD_disable28] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable28].setDisplayName ( "" );
            methods[METHOD_dispatchEvent29] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent29].setDisplayName ( "" );
            methods[METHOD_doLayout30] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enableInputMethods33] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke44].setDisplayName ( "" );
            methods[METHOD_getBaseline45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline45].setDisplayName ( "" );
            methods[METHOD_getBounds46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds46].setDisplayName ( "" );
            methods[METHOD_getClientProperty47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentAt49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt49].setDisplayName ( "" );
            methods[METHOD_getComponentIndex50] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("getComponentIndex", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentIndex50].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder51] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder51].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke52].setDisplayName ( "" );
            methods[METHOD_getDefaultLightWeightPopupEnabled53] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("getDefaultLightWeightPopupEnabled", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLightWeightPopupEnabled53].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale54].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys55] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys55].setDisplayName ( "" );
            methods[METHOD_getFontMetrics56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics56].setDisplayName ( "" );
            methods[METHOD_getInsets57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets57].setDisplayName ( "" );
            methods[METHOD_getListeners58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners58].setDisplayName ( "" );
            methods[METHOD_getLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation59].setDisplayName ( "" );
            methods[METHOD_getMousePosition60] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition60].setDisplayName ( "" );
            methods[METHOD_getPopupLocation61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation61].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners62] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners62].setDisplayName ( "" );
            methods[METHOD_getSize63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize63].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation64].setDisplayName ( "" );
            methods[METHOD_getToolTipText65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText65].setDisplayName ( "" );
            methods[METHOD_gotFocus66] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus66].setDisplayName ( "" );
            methods[METHOD_grabFocus67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus67].setDisplayName ( "" );
            methods[METHOD_handleEvent68] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent68].setDisplayName ( "" );
            methods[METHOD_hasFocus69] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus69].setDisplayName ( "" );
            methods[METHOD_hide70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide70].setDisplayName ( "" );
            methods[METHOD_imageUpdate71] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate71].setDisplayName ( "" );
            methods[METHOD_insert72] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("insert", new Class[] {javax.swing.Action.class, int.class})); // NOI18N
            methods[METHOD_insert72].setDisplayName ( "" );
            methods[METHOD_insert73] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("insert", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_insert73].setDisplayName ( "" );
            methods[METHOD_insets74] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets74].setDisplayName ( "" );
            methods[METHOD_inside75] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside75].setDisplayName ( "" );
            methods[METHOD_invalidate76] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate76].setDisplayName ( "" );
            methods[METHOD_isAncestorOf77] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf77].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot78] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot78].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent79] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent79].setDisplayName ( "" );
            methods[METHOD_isPopupTrigger80] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("isPopupTrigger", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_isPopupTrigger80].setDisplayName ( "" );
            methods[METHOD_keyDown81] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown81].setDisplayName ( "" );
            methods[METHOD_keyUp82] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp82].setDisplayName ( "" );
            methods[METHOD_layout83] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_list85] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list85].setDisplayName ( "" );
            methods[METHOD_list86] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_locate89] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate89].setDisplayName ( "" );
            methods[METHOD_location90] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location90].setDisplayName ( "" );
            methods[METHOD_lostFocus91] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus91].setDisplayName ( "" );
            methods[METHOD_menuSelectionChanged92] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("menuSelectionChanged", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_menuSelectionChanged92].setDisplayName ( "" );
            methods[METHOD_minimumSize93] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize93].setDisplayName ( "" );
            methods[METHOD_mouseDown94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown94].setDisplayName ( "" );
            methods[METHOD_mouseDrag95] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag95].setDisplayName ( "" );
            methods[METHOD_mouseEnter96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter96].setDisplayName ( "" );
            methods[METHOD_mouseExit97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit97].setDisplayName ( "" );
            methods[METHOD_mouseMove98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove98].setDisplayName ( "" );
            methods[METHOD_mouseUp99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp99].setDisplayName ( "" );
            methods[METHOD_move100] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move100].setDisplayName ( "" );
            methods[METHOD_nextFocus101] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus101].setDisplayName ( "" );
            methods[METHOD_pack102] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("pack", new Class[] {})); // NOI18N
            methods[METHOD_pack102].setDisplayName ( "" );
            methods[METHOD_paint103] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint103].setDisplayName ( "" );
            methods[METHOD_paintAll104] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll104].setDisplayName ( "" );
            methods[METHOD_paintComponents105] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents105].setDisplayName ( "" );
            methods[METHOD_paintImmediately106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately106].setDisplayName ( "" );
            methods[METHOD_paintImmediately107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately107].setDisplayName ( "" );
            methods[METHOD_postEvent108] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent108].setDisplayName ( "" );
            methods[METHOD_preferredSize109] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize109].setDisplayName ( "" );
            methods[METHOD_prepareImage110] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage110].setDisplayName ( "" );
            methods[METHOD_prepareImage111] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage111].setDisplayName ( "" );
            methods[METHOD_print112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print112].setDisplayName ( "" );
            methods[METHOD_printAll113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll113].setDisplayName ( "" );
            methods[METHOD_printComponents114] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents114].setDisplayName ( "" );
            methods[METHOD_processKeyEvent115] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("processKeyEvent", new Class[] {java.awt.event.KeyEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processKeyEvent115].setDisplayName ( "" );
            methods[METHOD_processMouseEvent116] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("processMouseEvent", new Class[] {java.awt.event.MouseEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processMouseEvent116].setDisplayName ( "" );
            methods[METHOD_putClientProperty117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty117].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction118] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction118].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction119] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction119].setDisplayName ( "" );
            methods[METHOD_remove120] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove120].setDisplayName ( "" );
            methods[METHOD_remove121] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove121].setDisplayName ( "" );
            methods[METHOD_remove122] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove122].setDisplayName ( "" );
            methods[METHOD_removeAll123] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll123].setDisplayName ( "" );
            methods[METHOD_removeNotify124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify124].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener125] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener125].setDisplayName ( "" );
            methods[METHOD_repaint126] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint126].setDisplayName ( "" );
            methods[METHOD_repaint127] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint127].setDisplayName ( "" );
            methods[METHOD_repaint128] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint128].setDisplayName ( "" );
            methods[METHOD_repaint129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint129].setDisplayName ( "" );
            methods[METHOD_repaint130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint130].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus131] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus131].setDisplayName ( "" );
            methods[METHOD_requestFocus132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus132].setDisplayName ( "" );
            methods[METHOD_requestFocus133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus133].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow134].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions135].setDisplayName ( "" );
            methods[METHOD_reshape136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape136].setDisplayName ( "" );
            methods[METHOD_resize137] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize137].setDisplayName ( "" );
            methods[METHOD_resize138] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize138].setDisplayName ( "" );
            methods[METHOD_revalidate139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate139].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible140].setDisplayName ( "" );
            methods[METHOD_setBounds141] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds141].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder142] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder142].setDisplayName ( "" );
            methods[METHOD_setDefaultLightWeightPopupEnabled143] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("setDefaultLightWeightPopupEnabled", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_setDefaultLightWeightPopupEnabled143].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale144] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale144].setDisplayName ( "" );
            methods[METHOD_show145] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show145].setDisplayName ( "" );
            methods[METHOD_show146] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show146].setDisplayName ( "" );
            methods[METHOD_show147] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("show", new Class[] {java.awt.Component.class, int.class, int.class})); // NOI18N
            methods[METHOD_show147].setDisplayName ( "" );
            methods[METHOD_size148] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size148].setDisplayName ( "" );
            methods[METHOD_toString149] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString149].setDisplayName ( "" );
            methods[METHOD_transferFocus150] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus150].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward151] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward151].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle152] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle152].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle153] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle153].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction154] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction154].setDisplayName ( "" );
            methods[METHOD_update155] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update155].setDisplayName ( "" );
            methods[METHOD_updateUI156] = new MethodDescriptor(javax.swing.JPopupMenu.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI156].setDisplayName ( "" );
            methods[METHOD_validate157] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate157].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/py/com/oym/widgets/icons/JPopupMenu.jpg";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/py/com/oym/widgets/icons/JPopupMenu.jpg";
    private static String iconNameM16 = "/py/com/oym/widgets/icons/JPopupMenu.jpg";
    private static String iconNameM32 = "/py/com/oym/widgets/icons/JPopupMenu.jpg";//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
