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
public class JMenuBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( py.com.oym.widgets.JMenu.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accelerator = 0;
    private static final int PROPERTY_accessibleContext = 1;
    private static final int PROPERTY_action = 2;
    private static final int PROPERTY_actionCommand = 3;
    private static final int PROPERTY_actionListeners = 4;
    private static final int PROPERTY_actionMap = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_armed = 9;
    private static final int PROPERTY_autoscrolls = 10;
    private static final int PROPERTY_background = 11;
    private static final int PROPERTY_backgroundSet = 12;
    private static final int PROPERTY_baselineResizeBehavior = 13;
    private static final int PROPERTY_border = 14;
    private static final int PROPERTY_borderPainted = 15;
    private static final int PROPERTY_bounds = 16;
    private static final int PROPERTY_changeListeners = 17;
    private static final int PROPERTY_colorModel = 18;
    private static final int PROPERTY_component = 19;
    private static final int PROPERTY_componentCount = 20;
    private static final int PROPERTY_componentListeners = 21;
    private static final int PROPERTY_componentOrientation = 22;
    private static final int PROPERTY_componentPopupMenu = 23;
    private static final int PROPERTY_components = 24;
    private static final int PROPERTY_containerListeners = 25;
    private static final int PROPERTY_contentAreaFilled = 26;
    private static final int PROPERTY_cursor = 27;
    private static final int PROPERTY_cursorSet = 28;
    private static final int PROPERTY_debugGraphicsOptions = 29;
    private static final int PROPERTY_delay = 30;
    private static final int PROPERTY_disabledIcon = 31;
    private static final int PROPERTY_disabledSelectedIcon = 32;
    private static final int PROPERTY_displayable = 33;
    private static final int PROPERTY_displayedMnemonicIndex = 34;
    private static final int PROPERTY_doubleBuffered = 35;
    private static final int PROPERTY_dropTarget = 36;
    private static final int PROPERTY_enabled = 37;
    private static final int PROPERTY_focusable = 38;
    private static final int PROPERTY_focusCycleRoot = 39;
    private static final int PROPERTY_focusCycleRootAncestor = 40;
    private static final int PROPERTY_focusListeners = 41;
    private static final int PROPERTY_focusOwner = 42;
    private static final int PROPERTY_focusPainted = 43;
    private static final int PROPERTY_focusTraversable = 44;
    private static final int PROPERTY_focusTraversalKeys = 45;
    private static final int PROPERTY_focusTraversalKeysEnabled = 46;
    private static final int PROPERTY_focusTraversalPolicy = 47;
    private static final int PROPERTY_focusTraversalPolicyProvider = 48;
    private static final int PROPERTY_focusTraversalPolicySet = 49;
    private static final int PROPERTY_font = 50;
    private static final int PROPERTY_fontSet = 51;
    private static final int PROPERTY_foreground = 52;
    private static final int PROPERTY_foregroundSet = 53;
    private static final int PROPERTY_graphics = 54;
    private static final int PROPERTY_graphicsConfiguration = 55;
    private static final int PROPERTY_height = 56;
    private static final int PROPERTY_hideActionText = 57;
    private static final int PROPERTY_hierarchyBoundsListeners = 58;
    private static final int PROPERTY_hierarchyListeners = 59;
    private static final int PROPERTY_horizontalAlignment = 60;
    private static final int PROPERTY_horizontalTextPosition = 61;
    private static final int PROPERTY_icon = 62;
    private static final int PROPERTY_iconTextGap = 63;
    private static final int PROPERTY_ignoreRepaint = 64;
    private static final int PROPERTY_inheritsPopupMenu = 65;
    private static final int PROPERTY_inputContext = 66;
    private static final int PROPERTY_inputMap = 67;
    private static final int PROPERTY_inputMethodListeners = 68;
    private static final int PROPERTY_inputMethodRequests = 69;
    private static final int PROPERTY_inputVerifier = 70;
    private static final int PROPERTY_insets = 71;
    private static final int PROPERTY_item = 72;
    private static final int PROPERTY_itemCount = 73;
    private static final int PROPERTY_itemListeners = 74;
    private static final int PROPERTY_keyListeners = 75;
    private static final int PROPERTY_label = 76;
    private static final int PROPERTY_layout = 77;
    private static final int PROPERTY_lightweight = 78;
    private static final int PROPERTY_locale = 79;
    private static final int PROPERTY_location = 80;
    private static final int PROPERTY_locationOnScreen = 81;
    private static final int PROPERTY_managingFocus = 82;
    private static final int PROPERTY_margin = 83;
    private static final int PROPERTY_maximumSize = 84;
    private static final int PROPERTY_maximumSizeSet = 85;
    private static final int PROPERTY_menuComponent = 86;
    private static final int PROPERTY_menuComponentCount = 87;
    private static final int PROPERTY_menuComponents = 88;
    private static final int PROPERTY_menuDragMouseListeners = 89;
    private static final int PROPERTY_menuKeyListeners = 90;
    private static final int PROPERTY_menuListeners = 91;
    private static final int PROPERTY_menuLocation = 92;
    private static final int PROPERTY_minimumSize = 93;
    private static final int PROPERTY_minimumSizeSet = 94;
    private static final int PROPERTY_mnemonic = 95;
    private static final int PROPERTY_model = 96;
    private static final int PROPERTY_mouseListeners = 97;
    private static final int PROPERTY_mouseMotionListeners = 98;
    private static final int PROPERTY_mousePosition = 99;
    private static final int PROPERTY_mouseWheelListeners = 100;
    private static final int PROPERTY_multiClickThreshhold = 101;
    private static final int PROPERTY_name = 102;
    private static final int PROPERTY_nextFocusableComponent = 103;
    private static final int PROPERTY_opaque = 104;
    private static final int PROPERTY_optimizedDrawingEnabled = 105;
    private static final int PROPERTY_paintingForPrint = 106;
    private static final int PROPERTY_paintingTile = 107;
    private static final int PROPERTY_parent = 108;
    private static final int PROPERTY_peer = 109;
    private static final int PROPERTY_popupMenu = 110;
    private static final int PROPERTY_popupMenuVisible = 111;
    private static final int PROPERTY_preferredSize = 112;
    private static final int PROPERTY_preferredSizeSet = 113;
    private static final int PROPERTY_pressedIcon = 114;
    private static final int PROPERTY_propertyChangeListeners = 115;
    private static final int PROPERTY_registeredKeyStrokes = 116;
    private static final int PROPERTY_requestFocusEnabled = 117;
    private static final int PROPERTY_rolloverEnabled = 118;
    private static final int PROPERTY_rolloverIcon = 119;
    private static final int PROPERTY_rolloverSelectedIcon = 120;
    private static final int PROPERTY_rootPane = 121;
    private static final int PROPERTY_selected = 122;
    private static final int PROPERTY_selectedIcon = 123;
    private static final int PROPERTY_selectedObjects = 124;
    private static final int PROPERTY_showing = 125;
    private static final int PROPERTY_size = 126;
    private static final int PROPERTY_subElements = 127;
    private static final int PROPERTY_tearOff = 128;
    private static final int PROPERTY_text = 129;
    private static final int PROPERTY_toolkit = 130;
    private static final int PROPERTY_toolTipText = 131;
    private static final int PROPERTY_topLevelAncestor = 132;
    private static final int PROPERTY_topLevelMenu = 133;
    private static final int PROPERTY_transferHandler = 134;
    private static final int PROPERTY_treeLock = 135;
    private static final int PROPERTY_UI = 136;
    private static final int PROPERTY_UIClassID = 137;
    private static final int PROPERTY_valid = 138;
    private static final int PROPERTY_validateRoot = 139;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 140;
    private static final int PROPERTY_verticalAlignment = 141;
    private static final int PROPERTY_verticalTextPosition = 142;
    private static final int PROPERTY_vetoableChangeListeners = 143;
    private static final int PROPERTY_visible = 144;
    private static final int PROPERTY_visibleRect = 145;
    private static final int PROPERTY_width = 146;
    private static final int PROPERTY_x = 147;
    private static final int PROPERTY_y = 148;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[149];
    
        try {
            properties[PROPERTY_accelerator] = new PropertyDescriptor ( "accelerator", py.com.oym.widgets.JMenu.class, "getAccelerator", "setAccelerator" ); // NOI18N
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", py.com.oym.widgets.JMenu.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_action] = new PropertyDescriptor ( "action", py.com.oym.widgets.JMenu.class, "getAction", "setAction" ); // NOI18N
            properties[PROPERTY_actionCommand] = new PropertyDescriptor ( "actionCommand", py.com.oym.widgets.JMenu.class, "getActionCommand", "setActionCommand" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", py.com.oym.widgets.JMenu.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", py.com.oym.widgets.JMenu.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", py.com.oym.widgets.JMenu.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", py.com.oym.widgets.JMenu.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", py.com.oym.widgets.JMenu.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_armed] = new PropertyDescriptor ( "armed", py.com.oym.widgets.JMenu.class, "isArmed", "setArmed" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", py.com.oym.widgets.JMenu.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", py.com.oym.widgets.JMenu.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", py.com.oym.widgets.JMenu.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", py.com.oym.widgets.JMenu.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", py.com.oym.widgets.JMenu.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_borderPainted] = new PropertyDescriptor ( "borderPainted", py.com.oym.widgets.JMenu.class, "isBorderPainted", "setBorderPainted" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", py.com.oym.widgets.JMenu.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_changeListeners] = new PropertyDescriptor ( "changeListeners", py.com.oym.widgets.JMenu.class, "getChangeListeners", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", py.com.oym.widgets.JMenu.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new PropertyDescriptor ( "component", py.com.oym.widgets.JMenu.class, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", py.com.oym.widgets.JMenu.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", py.com.oym.widgets.JMenu.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", py.com.oym.widgets.JMenu.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", py.com.oym.widgets.JMenu.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", py.com.oym.widgets.JMenu.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", py.com.oym.widgets.JMenu.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentAreaFilled] = new PropertyDescriptor ( "contentAreaFilled", py.com.oym.widgets.JMenu.class, "isContentAreaFilled", "setContentAreaFilled" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", py.com.oym.widgets.JMenu.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", py.com.oym.widgets.JMenu.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", py.com.oym.widgets.JMenu.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_delay] = new PropertyDescriptor ( "delay", py.com.oym.widgets.JMenu.class, "getDelay", "setDelay" ); // NOI18N
            properties[PROPERTY_disabledIcon] = new PropertyDescriptor ( "disabledIcon", py.com.oym.widgets.JMenu.class, "getDisabledIcon", "setDisabledIcon" ); // NOI18N
            properties[PROPERTY_disabledSelectedIcon] = new PropertyDescriptor ( "disabledSelectedIcon", py.com.oym.widgets.JMenu.class, "getDisabledSelectedIcon", "setDisabledSelectedIcon" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", py.com.oym.widgets.JMenu.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_displayedMnemonicIndex] = new PropertyDescriptor ( "displayedMnemonicIndex", py.com.oym.widgets.JMenu.class, "getDisplayedMnemonicIndex", "setDisplayedMnemonicIndex" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", py.com.oym.widgets.JMenu.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", py.com.oym.widgets.JMenu.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", py.com.oym.widgets.JMenu.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", py.com.oym.widgets.JMenu.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", py.com.oym.widgets.JMenu.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", py.com.oym.widgets.JMenu.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", py.com.oym.widgets.JMenu.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", py.com.oym.widgets.JMenu.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusPainted] = new PropertyDescriptor ( "focusPainted", py.com.oym.widgets.JMenu.class, "isFocusPainted", "setFocusPainted" ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", py.com.oym.widgets.JMenu.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", py.com.oym.widgets.JMenu.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", py.com.oym.widgets.JMenu.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", py.com.oym.widgets.JMenu.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", py.com.oym.widgets.JMenu.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", py.com.oym.widgets.JMenu.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", py.com.oym.widgets.JMenu.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", py.com.oym.widgets.JMenu.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", py.com.oym.widgets.JMenu.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", py.com.oym.widgets.JMenu.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", py.com.oym.widgets.JMenu.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", py.com.oym.widgets.JMenu.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", py.com.oym.widgets.JMenu.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hideActionText] = new PropertyDescriptor ( "hideActionText", py.com.oym.widgets.JMenu.class, "getHideActionText", "setHideActionText" ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", py.com.oym.widgets.JMenu.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", py.com.oym.widgets.JMenu.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_horizontalAlignment] = new PropertyDescriptor ( "horizontalAlignment", py.com.oym.widgets.JMenu.class, "getHorizontalAlignment", "setHorizontalAlignment" ); // NOI18N
            properties[PROPERTY_horizontalTextPosition] = new PropertyDescriptor ( "horizontalTextPosition", py.com.oym.widgets.JMenu.class, "getHorizontalTextPosition", "setHorizontalTextPosition" ); // NOI18N
            properties[PROPERTY_icon] = new PropertyDescriptor ( "icon", py.com.oym.widgets.JMenu.class, "getIcon", "setIcon" ); // NOI18N
            properties[PROPERTY_iconTextGap] = new PropertyDescriptor ( "iconTextGap", py.com.oym.widgets.JMenu.class, "getIconTextGap", "setIconTextGap" ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", py.com.oym.widgets.JMenu.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", py.com.oym.widgets.JMenu.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", py.com.oym.widgets.JMenu.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", py.com.oym.widgets.JMenu.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", py.com.oym.widgets.JMenu.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", py.com.oym.widgets.JMenu.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", py.com.oym.widgets.JMenu.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", py.com.oym.widgets.JMenu.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_item] = new IndexedPropertyDescriptor ( "item", py.com.oym.widgets.JMenu.class, null, null, "getItem", null ); // NOI18N
            properties[PROPERTY_itemCount] = new PropertyDescriptor ( "itemCount", py.com.oym.widgets.JMenu.class, "getItemCount", null ); // NOI18N
            properties[PROPERTY_itemListeners] = new PropertyDescriptor ( "itemListeners", py.com.oym.widgets.JMenu.class, "getItemListeners", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", py.com.oym.widgets.JMenu.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_label] = new PropertyDescriptor ( "label", py.com.oym.widgets.JMenu.class, "getLabel", "setLabel" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", py.com.oym.widgets.JMenu.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", py.com.oym.widgets.JMenu.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", py.com.oym.widgets.JMenu.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", py.com.oym.widgets.JMenu.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", py.com.oym.widgets.JMenu.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", py.com.oym.widgets.JMenu.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", py.com.oym.widgets.JMenu.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", py.com.oym.widgets.JMenu.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", py.com.oym.widgets.JMenu.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_menuComponent] = new IndexedPropertyDescriptor ( "menuComponent", py.com.oym.widgets.JMenu.class, null, null, "getMenuComponent", null ); // NOI18N
            properties[PROPERTY_menuComponentCount] = new PropertyDescriptor ( "menuComponentCount", py.com.oym.widgets.JMenu.class, "getMenuComponentCount", null ); // NOI18N
            properties[PROPERTY_menuComponents] = new PropertyDescriptor ( "menuComponents", py.com.oym.widgets.JMenu.class, "getMenuComponents", null ); // NOI18N
            properties[PROPERTY_menuDragMouseListeners] = new PropertyDescriptor ( "menuDragMouseListeners", py.com.oym.widgets.JMenu.class, "getMenuDragMouseListeners", null ); // NOI18N
            properties[PROPERTY_menuKeyListeners] = new PropertyDescriptor ( "menuKeyListeners", py.com.oym.widgets.JMenu.class, "getMenuKeyListeners", null ); // NOI18N
            properties[PROPERTY_menuListeners] = new PropertyDescriptor ( "menuListeners", py.com.oym.widgets.JMenu.class, "getMenuListeners", null ); // NOI18N
            properties[PROPERTY_menuLocation] = new IndexedPropertyDescriptor ( "menuLocation", py.com.oym.widgets.JMenu.class, null, null, null, "setMenuLocation" ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", py.com.oym.widgets.JMenu.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", py.com.oym.widgets.JMenu.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mnemonic] = new PropertyDescriptor ( "mnemonic", py.com.oym.widgets.JMenu.class, null, "setMnemonic" ); // NOI18N
            properties[PROPERTY_model] = new PropertyDescriptor ( "model", py.com.oym.widgets.JMenu.class, "getModel", "setModel" ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", py.com.oym.widgets.JMenu.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", py.com.oym.widgets.JMenu.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", py.com.oym.widgets.JMenu.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", py.com.oym.widgets.JMenu.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_multiClickThreshhold] = new PropertyDescriptor ( "multiClickThreshhold", py.com.oym.widgets.JMenu.class, "getMultiClickThreshhold", "setMultiClickThreshhold" ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", py.com.oym.widgets.JMenu.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", py.com.oym.widgets.JMenu.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", py.com.oym.widgets.JMenu.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", py.com.oym.widgets.JMenu.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", py.com.oym.widgets.JMenu.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", py.com.oym.widgets.JMenu.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", py.com.oym.widgets.JMenu.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", py.com.oym.widgets.JMenu.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_popupMenu] = new PropertyDescriptor ( "popupMenu", py.com.oym.widgets.JMenu.class, "getPopupMenu", null ); // NOI18N
            properties[PROPERTY_popupMenuVisible] = new PropertyDescriptor ( "popupMenuVisible", py.com.oym.widgets.JMenu.class, "isPopupMenuVisible", "setPopupMenuVisible" ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", py.com.oym.widgets.JMenu.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", py.com.oym.widgets.JMenu.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_pressedIcon] = new PropertyDescriptor ( "pressedIcon", py.com.oym.widgets.JMenu.class, "getPressedIcon", "setPressedIcon" ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", py.com.oym.widgets.JMenu.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", py.com.oym.widgets.JMenu.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", py.com.oym.widgets.JMenu.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rolloverEnabled] = new PropertyDescriptor ( "rolloverEnabled", py.com.oym.widgets.JMenu.class, "isRolloverEnabled", "setRolloverEnabled" ); // NOI18N
            properties[PROPERTY_rolloverIcon] = new PropertyDescriptor ( "rolloverIcon", py.com.oym.widgets.JMenu.class, "getRolloverIcon", "setRolloverIcon" ); // NOI18N
            properties[PROPERTY_rolloverSelectedIcon] = new PropertyDescriptor ( "rolloverSelectedIcon", py.com.oym.widgets.JMenu.class, "getRolloverSelectedIcon", "setRolloverSelectedIcon" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", py.com.oym.widgets.JMenu.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selected] = new PropertyDescriptor ( "selected", py.com.oym.widgets.JMenu.class, "isSelected", "setSelected" ); // NOI18N
            properties[PROPERTY_selectedIcon] = new PropertyDescriptor ( "selectedIcon", py.com.oym.widgets.JMenu.class, "getSelectedIcon", "setSelectedIcon" ); // NOI18N
            properties[PROPERTY_selectedObjects] = new PropertyDescriptor ( "selectedObjects", py.com.oym.widgets.JMenu.class, "getSelectedObjects", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", py.com.oym.widgets.JMenu.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", py.com.oym.widgets.JMenu.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_subElements] = new PropertyDescriptor ( "subElements", py.com.oym.widgets.JMenu.class, "getSubElements", null ); // NOI18N
            properties[PROPERTY_tearOff] = new PropertyDescriptor ( "tearOff", py.com.oym.widgets.JMenu.class, "isTearOff", null ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", py.com.oym.widgets.JMenu.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", py.com.oym.widgets.JMenu.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", py.com.oym.widgets.JMenu.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", py.com.oym.widgets.JMenu.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_topLevelMenu] = new PropertyDescriptor ( "topLevelMenu", py.com.oym.widgets.JMenu.class, "isTopLevelMenu", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", py.com.oym.widgets.JMenu.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", py.com.oym.widgets.JMenu.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", py.com.oym.widgets.JMenu.class, null, "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", py.com.oym.widgets.JMenu.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", py.com.oym.widgets.JMenu.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", py.com.oym.widgets.JMenu.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", py.com.oym.widgets.JMenu.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_verticalAlignment] = new PropertyDescriptor ( "verticalAlignment", py.com.oym.widgets.JMenu.class, "getVerticalAlignment", "setVerticalAlignment" ); // NOI18N
            properties[PROPERTY_verticalTextPosition] = new PropertyDescriptor ( "verticalTextPosition", py.com.oym.widgets.JMenu.class, "getVerticalTextPosition", "setVerticalTextPosition" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", py.com.oym.widgets.JMenu.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", py.com.oym.widgets.JMenu.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", py.com.oym.widgets.JMenu.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", py.com.oym.widgets.JMenu.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", py.com.oym.widgets.JMenu.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", py.com.oym.widgets.JMenu.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_changeListener = 2;
    private static final int EVENT_componentListener = 3;
    private static final int EVENT_containerListener = 4;
    private static final int EVENT_focusListener = 5;
    private static final int EVENT_hierarchyBoundsListener = 6;
    private static final int EVENT_hierarchyListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_itemListener = 9;
    private static final int EVENT_keyListener = 10;
    private static final int EVENT_menuDragMouseListener = 11;
    private static final int EVENT_menuKeyListener = 12;
    private static final int EVENT_menuListener = 13;
    private static final int EVENT_mouseListener = 14;
    private static final int EVENT_mouseMotionListener = 15;
    private static final int EVENT_mouseWheelListener = 16;
    private static final int EVENT_propertyChangeListener = 17;
    private static final int EVENT_vetoableChangeListener = 18;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[19];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_changeListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "changeListener", javax.swing.event.ChangeListener.class, new String[] {"stateChanged"}, "addChangeListener", "removeChangeListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_itemListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "itemListener", java.awt.event.ItemListener.class, new String[] {"itemStateChanged"}, "addItemListener", "removeItemListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_menuDragMouseListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "menuDragMouseListener", javax.swing.event.MenuDragMouseListener.class, new String[] {"menuDragMouseEntered", "menuDragMouseExited", "menuDragMouseDragged", "menuDragMouseReleased"}, "addMenuDragMouseListener", "removeMenuDragMouseListener" ); // NOI18N
            eventSets[EVENT_menuKeyListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "menuKeyListener", javax.swing.event.MenuKeyListener.class, new String[] {"menuKeyTyped", "menuKeyPressed", "menuKeyReleased"}, "addMenuKeyListener", "removeMenuKeyListener" ); // NOI18N
            eventSets[EVENT_menuListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "menuListener", javax.swing.event.MenuListener.class, new String[] {"menuSelected", "menuDeselected", "menuCanceled"}, "addMenuListener", "removeMenuListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JMenu.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_doClick30 = 30;
    private static final int METHOD_doClick31 = 31;
    private static final int METHOD_doLayout32 = 32;
    private static final int METHOD_enable33 = 33;
    private static final int METHOD_enable34 = 34;
    private static final int METHOD_enableInputMethods35 = 35;
    private static final int METHOD_findComponentAt36 = 36;
    private static final int METHOD_findComponentAt37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_firePropertyChange44 = 44;
    private static final int METHOD_firePropertyChange45 = 45;
    private static final int METHOD_getActionForKeyStroke46 = 46;
    private static final int METHOD_getBaseline47 = 47;
    private static final int METHOD_getBounds48 = 48;
    private static final int METHOD_getClientProperty49 = 49;
    private static final int METHOD_getComponentAt50 = 50;
    private static final int METHOD_getComponentAt51 = 51;
    private static final int METHOD_getComponentZOrder52 = 52;
    private static final int METHOD_getConditionForKeyStroke53 = 53;
    private static final int METHOD_getDefaultLocale54 = 54;
    private static final int METHOD_getFocusTraversalKeys55 = 55;
    private static final int METHOD_getFontMetrics56 = 56;
    private static final int METHOD_getInsets57 = 57;
    private static final int METHOD_getListeners58 = 58;
    private static final int METHOD_getLocation59 = 59;
    private static final int METHOD_getMnemonic60 = 60;
    private static final int METHOD_getMousePosition61 = 61;
    private static final int METHOD_getPopupLocation62 = 62;
    private static final int METHOD_getPropertyChangeListeners63 = 63;
    private static final int METHOD_getSize64 = 64;
    private static final int METHOD_getToolTipLocation65 = 65;
    private static final int METHOD_getToolTipText66 = 66;
    private static final int METHOD_getUI67 = 67;
    private static final int METHOD_gotFocus68 = 68;
    private static final int METHOD_grabFocus69 = 69;
    private static final int METHOD_handleEvent70 = 70;
    private static final int METHOD_hasFocus71 = 71;
    private static final int METHOD_hide72 = 72;
    private static final int METHOD_imageUpdate73 = 73;
    private static final int METHOD_insert74 = 74;
    private static final int METHOD_insert75 = 75;
    private static final int METHOD_insert76 = 76;
    private static final int METHOD_insertSeparator77 = 77;
    private static final int METHOD_insets78 = 78;
    private static final int METHOD_inside79 = 79;
    private static final int METHOD_invalidate80 = 80;
    private static final int METHOD_isAncestorOf81 = 81;
    private static final int METHOD_isFocusCycleRoot82 = 82;
    private static final int METHOD_isLightweightComponent83 = 83;
    private static final int METHOD_isMenuComponent84 = 84;
    private static final int METHOD_keyDown85 = 85;
    private static final int METHOD_keyUp86 = 86;
    private static final int METHOD_layout87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_list89 = 89;
    private static final int METHOD_list90 = 90;
    private static final int METHOD_list91 = 91;
    private static final int METHOD_list92 = 92;
    private static final int METHOD_locate93 = 93;
    private static final int METHOD_location94 = 94;
    private static final int METHOD_lostFocus95 = 95;
    private static final int METHOD_menuSelectionChanged96 = 96;
    private static final int METHOD_minimumSize97 = 97;
    private static final int METHOD_mouseDown98 = 98;
    private static final int METHOD_mouseDrag99 = 99;
    private static final int METHOD_mouseEnter100 = 100;
    private static final int METHOD_mouseExit101 = 101;
    private static final int METHOD_mouseMove102 = 102;
    private static final int METHOD_mouseUp103 = 103;
    private static final int METHOD_move104 = 104;
    private static final int METHOD_nextFocus105 = 105;
    private static final int METHOD_paint106 = 106;
    private static final int METHOD_paintAll107 = 107;
    private static final int METHOD_paintComponents108 = 108;
    private static final int METHOD_paintImmediately109 = 109;
    private static final int METHOD_paintImmediately110 = 110;
    private static final int METHOD_postEvent111 = 111;
    private static final int METHOD_preferredSize112 = 112;
    private static final int METHOD_prepareImage113 = 113;
    private static final int METHOD_prepareImage114 = 114;
    private static final int METHOD_print115 = 115;
    private static final int METHOD_printAll116 = 116;
    private static final int METHOD_printComponents117 = 117;
    private static final int METHOD_processKeyEvent118 = 118;
    private static final int METHOD_processMenuDragMouseEvent119 = 119;
    private static final int METHOD_processMenuKeyEvent120 = 120;
    private static final int METHOD_processMouseEvent121 = 121;
    private static final int METHOD_putClientProperty122 = 122;
    private static final int METHOD_registerKeyboardAction123 = 123;
    private static final int METHOD_registerKeyboardAction124 = 124;
    private static final int METHOD_remove125 = 125;
    private static final int METHOD_remove126 = 126;
    private static final int METHOD_remove127 = 127;
    private static final int METHOD_remove128 = 128;
    private static final int METHOD_removeAll129 = 129;
    private static final int METHOD_removeNotify130 = 130;
    private static final int METHOD_removePropertyChangeListener131 = 131;
    private static final int METHOD_repaint132 = 132;
    private static final int METHOD_repaint133 = 133;
    private static final int METHOD_repaint134 = 134;
    private static final int METHOD_repaint135 = 135;
    private static final int METHOD_repaint136 = 136;
    private static final int METHOD_requestDefaultFocus137 = 137;
    private static final int METHOD_requestFocus138 = 138;
    private static final int METHOD_requestFocus139 = 139;
    private static final int METHOD_requestFocusInWindow140 = 140;
    private static final int METHOD_resetKeyboardActions141 = 141;
    private static final int METHOD_reshape142 = 142;
    private static final int METHOD_resize143 = 143;
    private static final int METHOD_resize144 = 144;
    private static final int METHOD_revalidate145 = 145;
    private static final int METHOD_scrollRectToVisible146 = 146;
    private static final int METHOD_setBounds147 = 147;
    private static final int METHOD_setComponentZOrder148 = 148;
    private static final int METHOD_setDefaultLocale149 = 149;
    private static final int METHOD_setMnemonic150 = 150;
    private static final int METHOD_setUI151 = 151;
    private static final int METHOD_show152 = 152;
    private static final int METHOD_show153 = 153;
    private static final int METHOD_size154 = 154;
    private static final int METHOD_toString155 = 155;
    private static final int METHOD_transferFocus156 = 156;
    private static final int METHOD_transferFocusBackward157 = 157;
    private static final int METHOD_transferFocusDownCycle158 = 158;
    private static final int METHOD_transferFocusUpCycle159 = 159;
    private static final int METHOD_unregisterKeyboardAction160 = 160;
    private static final int METHOD_update161 = 161;
    private static final int METHOD_updateUI162 = 162;
    private static final int METHOD_validate163 = 163;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[164];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("add", new Class[] {javax.swing.JMenuItem.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_add8] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("add", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_add8].setDisplayName ( "" );
            methods[METHOD_add9] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("add", new Class[] {javax.swing.Action.class})); // NOI18N
            methods[METHOD_add9].setDisplayName ( "" );
            methods[METHOD_addNotify10] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify10].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener11] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener11].setDisplayName ( "" );
            methods[METHOD_addSeparator12] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("addSeparator", new Class[] {})); // NOI18N
            methods[METHOD_addSeparator12].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation13] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
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
            methods[METHOD_doClick30] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("doClick", new Class[] {})); // NOI18N
            methods[METHOD_doClick30].setDisplayName ( "" );
            methods[METHOD_doClick31] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("doClick", new Class[] {int.class})); // NOI18N
            methods[METHOD_doClick31].setDisplayName ( "" );
            methods[METHOD_doLayout32] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout32].setDisplayName ( "" );
            methods[METHOD_enable33] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable33].setDisplayName ( "" );
            methods[METHOD_enable34] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable34].setDisplayName ( "" );
            methods[METHOD_enableInputMethods35] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods35].setDisplayName ( "" );
            methods[METHOD_findComponentAt36] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt36].setDisplayName ( "" );
            methods[METHOD_findComponentAt37] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_firePropertyChange44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange44].setDisplayName ( "" );
            methods[METHOD_firePropertyChange45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange45].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke46].setDisplayName ( "" );
            methods[METHOD_getBaseline47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline47].setDisplayName ( "" );
            methods[METHOD_getBounds48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds48].setDisplayName ( "" );
            methods[METHOD_getClientProperty49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty49].setDisplayName ( "" );
            methods[METHOD_getComponentAt50] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt50].setDisplayName ( "" );
            methods[METHOD_getComponentAt51] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt51].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder52] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder52].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke53].setDisplayName ( "" );
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
            methods[METHOD_getMnemonic60] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getMnemonic", new Class[] {})); // NOI18N
            methods[METHOD_getMnemonic60].setDisplayName ( "" );
            methods[METHOD_getMousePosition61] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition61].setDisplayName ( "" );
            methods[METHOD_getPopupLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation62].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners63] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners63].setDisplayName ( "" );
            methods[METHOD_getSize64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize64].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation65].setDisplayName ( "" );
            methods[METHOD_getToolTipText66] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText66].setDisplayName ( "" );
            methods[METHOD_getUI67] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("getUI", new Class[] {})); // NOI18N
            methods[METHOD_getUI67].setDisplayName ( "" );
            methods[METHOD_gotFocus68] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus68].setDisplayName ( "" );
            methods[METHOD_grabFocus69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus69].setDisplayName ( "" );
            methods[METHOD_handleEvent70] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent70].setDisplayName ( "" );
            methods[METHOD_hasFocus71] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus71].setDisplayName ( "" );
            methods[METHOD_hide72] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide72].setDisplayName ( "" );
            methods[METHOD_imageUpdate73] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate73].setDisplayName ( "" );
            methods[METHOD_insert74] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("insert", new Class[] {java.lang.String.class, int.class})); // NOI18N
            methods[METHOD_insert74].setDisplayName ( "" );
            methods[METHOD_insert75] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("insert", new Class[] {javax.swing.JMenuItem.class, int.class})); // NOI18N
            methods[METHOD_insert75].setDisplayName ( "" );
            methods[METHOD_insert76] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("insert", new Class[] {javax.swing.Action.class, int.class})); // NOI18N
            methods[METHOD_insert76].setDisplayName ( "" );
            methods[METHOD_insertSeparator77] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("insertSeparator", new Class[] {int.class})); // NOI18N
            methods[METHOD_insertSeparator77].setDisplayName ( "" );
            methods[METHOD_insets78] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets78].setDisplayName ( "" );
            methods[METHOD_inside79] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside79].setDisplayName ( "" );
            methods[METHOD_invalidate80] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate80].setDisplayName ( "" );
            methods[METHOD_isAncestorOf81] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf81].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot82] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot82].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent83] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent83].setDisplayName ( "" );
            methods[METHOD_isMenuComponent84] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("isMenuComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isMenuComponent84].setDisplayName ( "" );
            methods[METHOD_keyDown85] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown85].setDisplayName ( "" );
            methods[METHOD_keyUp86] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp86].setDisplayName ( "" );
            methods[METHOD_layout87] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_list89] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list89].setDisplayName ( "" );
            methods[METHOD_list90] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list90].setDisplayName ( "" );
            methods[METHOD_list91] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list91].setDisplayName ( "" );
            methods[METHOD_list92] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list92].setDisplayName ( "" );
            methods[METHOD_locate93] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate93].setDisplayName ( "" );
            methods[METHOD_location94] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location94].setDisplayName ( "" );
            methods[METHOD_lostFocus95] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus95].setDisplayName ( "" );
            methods[METHOD_menuSelectionChanged96] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("menuSelectionChanged", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_menuSelectionChanged96].setDisplayName ( "" );
            methods[METHOD_minimumSize97] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize97].setDisplayName ( "" );
            methods[METHOD_mouseDown98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown98].setDisplayName ( "" );
            methods[METHOD_mouseDrag99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag99].setDisplayName ( "" );
            methods[METHOD_mouseEnter100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter100].setDisplayName ( "" );
            methods[METHOD_mouseExit101] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit101].setDisplayName ( "" );
            methods[METHOD_mouseMove102] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove102].setDisplayName ( "" );
            methods[METHOD_mouseUp103] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp103].setDisplayName ( "" );
            methods[METHOD_move104] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move104].setDisplayName ( "" );
            methods[METHOD_nextFocus105] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus105].setDisplayName ( "" );
            methods[METHOD_paint106] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint106].setDisplayName ( "" );
            methods[METHOD_paintAll107] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll107].setDisplayName ( "" );
            methods[METHOD_paintComponents108] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents108].setDisplayName ( "" );
            methods[METHOD_paintImmediately109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately109].setDisplayName ( "" );
            methods[METHOD_paintImmediately110] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately110].setDisplayName ( "" );
            methods[METHOD_postEvent111] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent111].setDisplayName ( "" );
            methods[METHOD_preferredSize112] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize112].setDisplayName ( "" );
            methods[METHOD_prepareImage113] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage113].setDisplayName ( "" );
            methods[METHOD_prepareImage114] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage114].setDisplayName ( "" );
            methods[METHOD_print115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print115].setDisplayName ( "" );
            methods[METHOD_printAll116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll116].setDisplayName ( "" );
            methods[METHOD_printComponents117] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents117].setDisplayName ( "" );
            methods[METHOD_processKeyEvent118] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processKeyEvent", new Class[] {java.awt.event.KeyEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processKeyEvent118].setDisplayName ( "" );
            methods[METHOD_processMenuDragMouseEvent119] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMenuDragMouseEvent", new Class[] {javax.swing.event.MenuDragMouseEvent.class})); // NOI18N
            methods[METHOD_processMenuDragMouseEvent119].setDisplayName ( "" );
            methods[METHOD_processMenuKeyEvent120] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMenuKeyEvent", new Class[] {javax.swing.event.MenuKeyEvent.class})); // NOI18N
            methods[METHOD_processMenuKeyEvent120].setDisplayName ( "" );
            methods[METHOD_processMouseEvent121] = new MethodDescriptor(javax.swing.JMenuItem.class.getMethod("processMouseEvent", new Class[] {java.awt.event.MouseEvent.class, javax.swing.MenuElement[].class, javax.swing.MenuSelectionManager.class})); // NOI18N
            methods[METHOD_processMouseEvent121].setDisplayName ( "" );
            methods[METHOD_putClientProperty122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty122].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction123].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction124].setDisplayName ( "" );
            methods[METHOD_remove125] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove125].setDisplayName ( "" );
            methods[METHOD_remove126] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("remove", new Class[] {javax.swing.JMenuItem.class})); // NOI18N
            methods[METHOD_remove126].setDisplayName ( "" );
            methods[METHOD_remove127] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove127].setDisplayName ( "" );
            methods[METHOD_remove128] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove128].setDisplayName ( "" );
            methods[METHOD_removeAll129] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll129].setDisplayName ( "" );
            methods[METHOD_removeNotify130] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify130].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener131] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener131].setDisplayName ( "" );
            methods[METHOD_repaint132] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint132].setDisplayName ( "" );
            methods[METHOD_repaint133] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint133].setDisplayName ( "" );
            methods[METHOD_repaint134] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint134].setDisplayName ( "" );
            methods[METHOD_repaint135] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint135].setDisplayName ( "" );
            methods[METHOD_repaint136] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint136].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus137].setDisplayName ( "" );
            methods[METHOD_requestFocus138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus138].setDisplayName ( "" );
            methods[METHOD_requestFocus139] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus139].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow140].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions141].setDisplayName ( "" );
            methods[METHOD_reshape142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape142].setDisplayName ( "" );
            methods[METHOD_resize143] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize143].setDisplayName ( "" );
            methods[METHOD_resize144] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize144].setDisplayName ( "" );
            methods[METHOD_revalidate145] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate145].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible146].setDisplayName ( "" );
            methods[METHOD_setBounds147] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds147].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder148] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder148].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale149] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale149].setDisplayName ( "" );
            methods[METHOD_setMnemonic150] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setMnemonic", new Class[] {int.class})); // NOI18N
            methods[METHOD_setMnemonic150].setDisplayName ( "" );
            methods[METHOD_setUI151] = new MethodDescriptor(javax.swing.AbstractButton.class.getMethod("setUI", new Class[] {javax.swing.plaf.ButtonUI.class})); // NOI18N
            methods[METHOD_setUI151].setDisplayName ( "" );
            methods[METHOD_show152] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show152].setDisplayName ( "" );
            methods[METHOD_show153] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show153].setDisplayName ( "" );
            methods[METHOD_size154] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size154].setDisplayName ( "" );
            methods[METHOD_toString155] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString155].setDisplayName ( "" );
            methods[METHOD_transferFocus156] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus156].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward157].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle158] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle158].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle159] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle159].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction160] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction160].setDisplayName ( "" );
            methods[METHOD_update161] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update161].setDisplayName ( "" );
            methods[METHOD_updateUI162] = new MethodDescriptor(javax.swing.JMenu.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI162].setDisplayName ( "" );
            methods[METHOD_validate163] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate163].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/py/com/oym/widgets/icons/JMenu.jpg";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/py/com/oym/widgets/icons/JMenu.jpg";
    private static String iconNameM16 = "/py/com/oym/widgets/icons/JMenu.jpg";
    private static String iconNameM32 = "/py/com/oym/widgets/icons/JMenu.jpg";//GEN-END:Icons

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
