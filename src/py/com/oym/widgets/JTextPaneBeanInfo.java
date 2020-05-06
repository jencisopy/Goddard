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
public class JTextPaneBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( py.com.oym.widgets.JTextPane.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_actions = 2;
    private static final int PROPERTY_alignmentX = 3;
    private static final int PROPERTY_alignmentY = 4;
    private static final int PROPERTY_ancestorListeners = 5;
    private static final int PROPERTY_autoscrolls = 6;
    private static final int PROPERTY_background = 7;
    private static final int PROPERTY_backgroundSet = 8;
    private static final int PROPERTY_baselineResizeBehavior = 9;
    private static final int PROPERTY_border = 10;
    private static final int PROPERTY_bounds = 11;
    private static final int PROPERTY_caret = 12;
    private static final int PROPERTY_caretColor = 13;
    private static final int PROPERTY_caretListeners = 14;
    private static final int PROPERTY_caretPosition = 15;
    private static final int PROPERTY_characterAttributes = 16;
    private static final int PROPERTY_colorModel = 17;
    private static final int PROPERTY_component = 18;
    private static final int PROPERTY_componentCount = 19;
    private static final int PROPERTY_componentListeners = 20;
    private static final int PROPERTY_componentOrientation = 21;
    private static final int PROPERTY_componentPopupMenu = 22;
    private static final int PROPERTY_components = 23;
    private static final int PROPERTY_containerListeners = 24;
    private static final int PROPERTY_contentType = 25;
    private static final int PROPERTY_cursor = 26;
    private static final int PROPERTY_cursorSet = 27;
    private static final int PROPERTY_debugGraphicsOptions = 28;
    private static final int PROPERTY_disabledTextColor = 29;
    private static final int PROPERTY_displayable = 30;
    private static final int PROPERTY_document = 31;
    private static final int PROPERTY_doubleBuffered = 32;
    private static final int PROPERTY_dragEnabled = 33;
    private static final int PROPERTY_dropLocation = 34;
    private static final int PROPERTY_dropMode = 35;
    private static final int PROPERTY_dropTarget = 36;
    private static final int PROPERTY_editable = 37;
    private static final int PROPERTY_editorKit = 38;
    private static final int PROPERTY_enabled = 39;
    private static final int PROPERTY_focusable = 40;
    private static final int PROPERTY_focusAccelerator = 41;
    private static final int PROPERTY_focusCycleRoot = 42;
    private static final int PROPERTY_focusCycleRootAncestor = 43;
    private static final int PROPERTY_focusListeners = 44;
    private static final int PROPERTY_focusOwner = 45;
    private static final int PROPERTY_focusTraversable = 46;
    private static final int PROPERTY_focusTraversalKeys = 47;
    private static final int PROPERTY_focusTraversalKeysEnabled = 48;
    private static final int PROPERTY_focusTraversalPolicy = 49;
    private static final int PROPERTY_focusTraversalPolicyProvider = 50;
    private static final int PROPERTY_focusTraversalPolicySet = 51;
    private static final int PROPERTY_font = 52;
    private static final int PROPERTY_fontSet = 53;
    private static final int PROPERTY_foreground = 54;
    private static final int PROPERTY_foregroundSet = 55;
    private static final int PROPERTY_graphics = 56;
    private static final int PROPERTY_graphicsConfiguration = 57;
    private static final int PROPERTY_height = 58;
    private static final int PROPERTY_hierarchyBoundsListeners = 59;
    private static final int PROPERTY_hierarchyListeners = 60;
    private static final int PROPERTY_highlighter = 61;
    private static final int PROPERTY_hyperlinkListeners = 62;
    private static final int PROPERTY_ignoreRepaint = 63;
    private static final int PROPERTY_inheritsPopupMenu = 64;
    private static final int PROPERTY_inputAttributes = 65;
    private static final int PROPERTY_inputContext = 66;
    private static final int PROPERTY_inputMap = 67;
    private static final int PROPERTY_inputMethodListeners = 68;
    private static final int PROPERTY_inputMethodRequests = 69;
    private static final int PROPERTY_inputVerifier = 70;
    private static final int PROPERTY_insets = 71;
    private static final int PROPERTY_keyListeners = 72;
    private static final int PROPERTY_keymap = 73;
    private static final int PROPERTY_layout = 74;
    private static final int PROPERTY_lightweight = 75;
    private static final int PROPERTY_locale = 76;
    private static final int PROPERTY_location = 77;
    private static final int PROPERTY_locationOnScreen = 78;
    private static final int PROPERTY_logicalStyle = 79;
    private static final int PROPERTY_managingFocus = 80;
    private static final int PROPERTY_margin = 81;
    private static final int PROPERTY_maximumSize = 82;
    private static final int PROPERTY_maximumSizeSet = 83;
    private static final int PROPERTY_minimumSize = 84;
    private static final int PROPERTY_minimumSizeSet = 85;
    private static final int PROPERTY_mouseListeners = 86;
    private static final int PROPERTY_mouseMotionListeners = 87;
    private static final int PROPERTY_mousePosition = 88;
    private static final int PROPERTY_mouseWheelListeners = 89;
    private static final int PROPERTY_name = 90;
    private static final int PROPERTY_navigationFilter = 91;
    private static final int PROPERTY_nextFocusableComponent = 92;
    private static final int PROPERTY_opaque = 93;
    private static final int PROPERTY_optimizedDrawingEnabled = 94;
    private static final int PROPERTY_page = 95;
    private static final int PROPERTY_paintingForPrint = 96;
    private static final int PROPERTY_paintingTile = 97;
    private static final int PROPERTY_paragraphAttributes = 98;
    private static final int PROPERTY_parent = 99;
    private static final int PROPERTY_peer = 100;
    private static final int PROPERTY_preferredScrollableViewportSize = 101;
    private static final int PROPERTY_preferredSize = 102;
    private static final int PROPERTY_preferredSizeSet = 103;
    private static final int PROPERTY_propertyChangeListeners = 104;
    private static final int PROPERTY_registeredKeyStrokes = 105;
    private static final int PROPERTY_requestFocusEnabled = 106;
    private static final int PROPERTY_rootPane = 107;
    private static final int PROPERTY_scrollableTracksViewportHeight = 108;
    private static final int PROPERTY_scrollableTracksViewportWidth = 109;
    private static final int PROPERTY_selectedText = 110;
    private static final int PROPERTY_selectedTextColor = 111;
    private static final int PROPERTY_selectionColor = 112;
    private static final int PROPERTY_selectionEnd = 113;
    private static final int PROPERTY_selectionStart = 114;
    private static final int PROPERTY_showing = 115;
    private static final int PROPERTY_size = 116;
    private static final int PROPERTY_styledDocument = 117;
    private static final int PROPERTY_text = 118;
    private static final int PROPERTY_toolkit = 119;
    private static final int PROPERTY_toolTipText = 120;
    private static final int PROPERTY_topLevelAncestor = 121;
    private static final int PROPERTY_transferHandler = 122;
    private static final int PROPERTY_treeLock = 123;
    private static final int PROPERTY_UI = 124;
    private static final int PROPERTY_UIClassID = 125;
    private static final int PROPERTY_valid = 126;
    private static final int PROPERTY_validateRoot = 127;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 128;
    private static final int PROPERTY_vetoableChangeListeners = 129;
    private static final int PROPERTY_visible = 130;
    private static final int PROPERTY_visibleRect = 131;
    private static final int PROPERTY_width = 132;
    private static final int PROPERTY_x = 133;
    private static final int PROPERTY_y = 134;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[135];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", py.com.oym.widgets.JTextPane.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", py.com.oym.widgets.JTextPane.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_actions] = new PropertyDescriptor ( "actions", py.com.oym.widgets.JTextPane.class, "getActions", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", py.com.oym.widgets.JTextPane.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", py.com.oym.widgets.JTextPane.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", py.com.oym.widgets.JTextPane.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", py.com.oym.widgets.JTextPane.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", py.com.oym.widgets.JTextPane.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", py.com.oym.widgets.JTextPane.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", py.com.oym.widgets.JTextPane.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", py.com.oym.widgets.JTextPane.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", py.com.oym.widgets.JTextPane.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_caret] = new PropertyDescriptor ( "caret", py.com.oym.widgets.JTextPane.class, "getCaret", "setCaret" ); // NOI18N
            properties[PROPERTY_caretColor] = new PropertyDescriptor ( "caretColor", py.com.oym.widgets.JTextPane.class, "getCaretColor", "setCaretColor" ); // NOI18N
            properties[PROPERTY_caretListeners] = new PropertyDescriptor ( "caretListeners", py.com.oym.widgets.JTextPane.class, "getCaretListeners", null ); // NOI18N
            properties[PROPERTY_caretPosition] = new PropertyDescriptor ( "caretPosition", py.com.oym.widgets.JTextPane.class, "getCaretPosition", "setCaretPosition" ); // NOI18N
            properties[PROPERTY_characterAttributes] = new PropertyDescriptor ( "characterAttributes", py.com.oym.widgets.JTextPane.class, "getCharacterAttributes", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", py.com.oym.widgets.JTextPane.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", py.com.oym.widgets.JTextPane.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", py.com.oym.widgets.JTextPane.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", py.com.oym.widgets.JTextPane.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", py.com.oym.widgets.JTextPane.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", py.com.oym.widgets.JTextPane.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", py.com.oym.widgets.JTextPane.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", py.com.oym.widgets.JTextPane.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentType] = new PropertyDescriptor ( "contentType", py.com.oym.widgets.JTextPane.class, "getContentType", "setContentType" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", py.com.oym.widgets.JTextPane.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", py.com.oym.widgets.JTextPane.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", py.com.oym.widgets.JTextPane.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_disabledTextColor] = new PropertyDescriptor ( "disabledTextColor", py.com.oym.widgets.JTextPane.class, "getDisabledTextColor", "setDisabledTextColor" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", py.com.oym.widgets.JTextPane.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_document] = new PropertyDescriptor ( "document", py.com.oym.widgets.JTextPane.class, "getDocument", "setDocument" ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", py.com.oym.widgets.JTextPane.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", py.com.oym.widgets.JTextPane.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropLocation] = new PropertyDescriptor ( "dropLocation", py.com.oym.widgets.JTextPane.class, "getDropLocation", null ); // NOI18N
            properties[PROPERTY_dropMode] = new PropertyDescriptor ( "dropMode", py.com.oym.widgets.JTextPane.class, "getDropMode", "setDropMode" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", py.com.oym.widgets.JTextPane.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_editable] = new PropertyDescriptor ( "editable", py.com.oym.widgets.JTextPane.class, "isEditable", "setEditable" ); // NOI18N
            properties[PROPERTY_editorKit] = new PropertyDescriptor ( "editorKit", py.com.oym.widgets.JTextPane.class, "getEditorKit", "setEditorKit" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", py.com.oym.widgets.JTextPane.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", py.com.oym.widgets.JTextPane.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusAccelerator] = new PropertyDescriptor ( "focusAccelerator", py.com.oym.widgets.JTextPane.class, "getFocusAccelerator", "setFocusAccelerator" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", py.com.oym.widgets.JTextPane.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", py.com.oym.widgets.JTextPane.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", py.com.oym.widgets.JTextPane.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", py.com.oym.widgets.JTextPane.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", py.com.oym.widgets.JTextPane.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", py.com.oym.widgets.JTextPane.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", py.com.oym.widgets.JTextPane.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", py.com.oym.widgets.JTextPane.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", py.com.oym.widgets.JTextPane.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", py.com.oym.widgets.JTextPane.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", py.com.oym.widgets.JTextPane.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", py.com.oym.widgets.JTextPane.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", py.com.oym.widgets.JTextPane.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", py.com.oym.widgets.JTextPane.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", py.com.oym.widgets.JTextPane.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", py.com.oym.widgets.JTextPane.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", py.com.oym.widgets.JTextPane.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", py.com.oym.widgets.JTextPane.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", py.com.oym.widgets.JTextPane.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_highlighter] = new PropertyDescriptor ( "highlighter", py.com.oym.widgets.JTextPane.class, "getHighlighter", "setHighlighter" ); // NOI18N
            properties[PROPERTY_hyperlinkListeners] = new PropertyDescriptor ( "hyperlinkListeners", py.com.oym.widgets.JTextPane.class, "getHyperlinkListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", py.com.oym.widgets.JTextPane.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", py.com.oym.widgets.JTextPane.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputAttributes] = new PropertyDescriptor ( "inputAttributes", py.com.oym.widgets.JTextPane.class, "getInputAttributes", null ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", py.com.oym.widgets.JTextPane.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", py.com.oym.widgets.JTextPane.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", py.com.oym.widgets.JTextPane.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", py.com.oym.widgets.JTextPane.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", py.com.oym.widgets.JTextPane.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", py.com.oym.widgets.JTextPane.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", py.com.oym.widgets.JTextPane.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_keymap] = new PropertyDescriptor ( "keymap", py.com.oym.widgets.JTextPane.class, "getKeymap", "setKeymap" ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", py.com.oym.widgets.JTextPane.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", py.com.oym.widgets.JTextPane.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", py.com.oym.widgets.JTextPane.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", py.com.oym.widgets.JTextPane.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", py.com.oym.widgets.JTextPane.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_logicalStyle] = new PropertyDescriptor ( "logicalStyle", py.com.oym.widgets.JTextPane.class, "getLogicalStyle", "setLogicalStyle" ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", py.com.oym.widgets.JTextPane.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_margin] = new PropertyDescriptor ( "margin", py.com.oym.widgets.JTextPane.class, "getMargin", "setMargin" ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", py.com.oym.widgets.JTextPane.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", py.com.oym.widgets.JTextPane.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", py.com.oym.widgets.JTextPane.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", py.com.oym.widgets.JTextPane.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", py.com.oym.widgets.JTextPane.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", py.com.oym.widgets.JTextPane.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", py.com.oym.widgets.JTextPane.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", py.com.oym.widgets.JTextPane.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", py.com.oym.widgets.JTextPane.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_navigationFilter] = new PropertyDescriptor ( "navigationFilter", py.com.oym.widgets.JTextPane.class, "getNavigationFilter", "setNavigationFilter" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", py.com.oym.widgets.JTextPane.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", py.com.oym.widgets.JTextPane.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", py.com.oym.widgets.JTextPane.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_page] = new PropertyDescriptor ( "page", py.com.oym.widgets.JTextPane.class, null, "setPage" ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", py.com.oym.widgets.JTextPane.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", py.com.oym.widgets.JTextPane.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_paragraphAttributes] = new PropertyDescriptor ( "paragraphAttributes", py.com.oym.widgets.JTextPane.class, "getParagraphAttributes", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", py.com.oym.widgets.JTextPane.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", py.com.oym.widgets.JTextPane.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", py.com.oym.widgets.JTextPane.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", py.com.oym.widgets.JTextPane.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", py.com.oym.widgets.JTextPane.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", py.com.oym.widgets.JTextPane.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", py.com.oym.widgets.JTextPane.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", py.com.oym.widgets.JTextPane.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", py.com.oym.widgets.JTextPane.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", py.com.oym.widgets.JTextPane.class, "getScrollableTracksViewportHeight", null ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", py.com.oym.widgets.JTextPane.class, "getScrollableTracksViewportWidth", null ); // NOI18N
            properties[PROPERTY_selectedText] = new PropertyDescriptor ( "selectedText", py.com.oym.widgets.JTextPane.class, "getSelectedText", null ); // NOI18N
            properties[PROPERTY_selectedTextColor] = new PropertyDescriptor ( "selectedTextColor", py.com.oym.widgets.JTextPane.class, "getSelectedTextColor", "setSelectedTextColor" ); // NOI18N
            properties[PROPERTY_selectionColor] = new PropertyDescriptor ( "selectionColor", py.com.oym.widgets.JTextPane.class, "getSelectionColor", "setSelectionColor" ); // NOI18N
            properties[PROPERTY_selectionEnd] = new PropertyDescriptor ( "selectionEnd", py.com.oym.widgets.JTextPane.class, "getSelectionEnd", "setSelectionEnd" ); // NOI18N
            properties[PROPERTY_selectionStart] = new PropertyDescriptor ( "selectionStart", py.com.oym.widgets.JTextPane.class, "getSelectionStart", "setSelectionStart" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", py.com.oym.widgets.JTextPane.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", py.com.oym.widgets.JTextPane.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_styledDocument] = new PropertyDescriptor ( "styledDocument", py.com.oym.widgets.JTextPane.class, "getStyledDocument", "setStyledDocument" ); // NOI18N
            properties[PROPERTY_text] = new PropertyDescriptor ( "text", py.com.oym.widgets.JTextPane.class, "getText", "setText" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", py.com.oym.widgets.JTextPane.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", py.com.oym.widgets.JTextPane.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", py.com.oym.widgets.JTextPane.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", py.com.oym.widgets.JTextPane.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", py.com.oym.widgets.JTextPane.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", py.com.oym.widgets.JTextPane.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", py.com.oym.widgets.JTextPane.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", py.com.oym.widgets.JTextPane.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", py.com.oym.widgets.JTextPane.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", py.com.oym.widgets.JTextPane.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", py.com.oym.widgets.JTextPane.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", py.com.oym.widgets.JTextPane.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", py.com.oym.widgets.JTextPane.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", py.com.oym.widgets.JTextPane.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", py.com.oym.widgets.JTextPane.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", py.com.oym.widgets.JTextPane.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_caretListener = 1;
    private static final int EVENT_componentListener = 2;
    private static final int EVENT_containerListener = 3;
    private static final int EVENT_focusListener = 4;
    private static final int EVENT_hierarchyBoundsListener = 5;
    private static final int EVENT_hierarchyListener = 6;
    private static final int EVENT_hyperlinkListener = 7;
    private static final int EVENT_inputMethodListener = 8;
    private static final int EVENT_keyListener = 9;
    private static final int EVENT_mouseListener = 10;
    private static final int EVENT_mouseMotionListener = 11;
    private static final int EVENT_mouseWheelListener = 12;
    private static final int EVENT_propertyChangeListener = 13;
    private static final int EVENT_vetoableChangeListener = 14;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[15];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_caretListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "caretListener", javax.swing.event.CaretListener.class, new String[] {"caretUpdate"}, "addCaretListener", "removeCaretListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_hyperlinkListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "hyperlinkListener", javax.swing.event.HyperlinkListener.class, new String[] {"hyperlinkUpdate"}, "addHyperlinkListener", "removeHyperlinkListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JTextPane.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_addKeymap7 = 7;
    private static final int METHOD_addNotify8 = 8;
    private static final int METHOD_addPropertyChangeListener9 = 9;
    private static final int METHOD_addStyle10 = 10;
    private static final int METHOD_applyComponentOrientation11 = 11;
    private static final int METHOD_areFocusTraversalKeysSet12 = 12;
    private static final int METHOD_bounds13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_checkImage15 = 15;
    private static final int METHOD_computeVisibleRect16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_contains18 = 18;
    private static final int METHOD_copy19 = 19;
    private static final int METHOD_countComponents20 = 20;
    private static final int METHOD_createEditorKitForContentType21 = 21;
    private static final int METHOD_createImage22 = 22;
    private static final int METHOD_createImage23 = 23;
    private static final int METHOD_createToolTip24 = 24;
    private static final int METHOD_createVolatileImage25 = 25;
    private static final int METHOD_createVolatileImage26 = 26;
    private static final int METHOD_cut27 = 27;
    private static final int METHOD_deliverEvent28 = 28;
    private static final int METHOD_disable29 = 29;
    private static final int METHOD_dispatchEvent30 = 30;
    private static final int METHOD_doLayout31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enable33 = 33;
    private static final int METHOD_enableInputMethods34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_findComponentAt36 = 36;
    private static final int METHOD_fireHyperlinkUpdate37 = 37;
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
    private static final int METHOD_getEditorKitClassNameForContentType55 = 55;
    private static final int METHOD_getEditorKitForContentType56 = 56;
    private static final int METHOD_getFocusTraversalKeys57 = 57;
    private static final int METHOD_getFontMetrics58 = 58;
    private static final int METHOD_getInsets59 = 59;
    private static final int METHOD_getKeymap60 = 60;
    private static final int METHOD_getListeners61 = 61;
    private static final int METHOD_getLocation62 = 62;
    private static final int METHOD_getMousePosition63 = 63;
    private static final int METHOD_getPage64 = 64;
    private static final int METHOD_getPopupLocation65 = 65;
    private static final int METHOD_getPrintable66 = 66;
    private static final int METHOD_getPropertyChangeListeners67 = 67;
    private static final int METHOD_getScrollableBlockIncrement68 = 68;
    private static final int METHOD_getScrollableUnitIncrement69 = 69;
    private static final int METHOD_getSize70 = 70;
    private static final int METHOD_getStyle71 = 71;
    private static final int METHOD_getText72 = 72;
    private static final int METHOD_getToolTipLocation73 = 73;
    private static final int METHOD_getToolTipText74 = 74;
    private static final int METHOD_gotFocus75 = 75;
    private static final int METHOD_grabFocus76 = 76;
    private static final int METHOD_handleEvent77 = 77;
    private static final int METHOD_hasFocus78 = 78;
    private static final int METHOD_hide79 = 79;
    private static final int METHOD_imageUpdate80 = 80;
    private static final int METHOD_insertComponent81 = 81;
    private static final int METHOD_insertIcon82 = 82;
    private static final int METHOD_insets83 = 83;
    private static final int METHOD_inside84 = 84;
    private static final int METHOD_invalidate85 = 85;
    private static final int METHOD_isAncestorOf86 = 86;
    private static final int METHOD_isFocusCycleRoot87 = 87;
    private static final int METHOD_isLightweightComponent88 = 88;
    private static final int METHOD_keyDown89 = 89;
    private static final int METHOD_keyUp90 = 90;
    private static final int METHOD_layout91 = 91;
    private static final int METHOD_list92 = 92;
    private static final int METHOD_list93 = 93;
    private static final int METHOD_list94 = 94;
    private static final int METHOD_list95 = 95;
    private static final int METHOD_list96 = 96;
    private static final int METHOD_loadKeymap97 = 97;
    private static final int METHOD_locate98 = 98;
    private static final int METHOD_location99 = 99;
    private static final int METHOD_lostFocus100 = 100;
    private static final int METHOD_minimumSize101 = 101;
    private static final int METHOD_modelToView102 = 102;
    private static final int METHOD_mouseDown103 = 103;
    private static final int METHOD_mouseDrag104 = 104;
    private static final int METHOD_mouseEnter105 = 105;
    private static final int METHOD_mouseExit106 = 106;
    private static final int METHOD_mouseMove107 = 107;
    private static final int METHOD_mouseUp108 = 108;
    private static final int METHOD_move109 = 109;
    private static final int METHOD_moveCaretPosition110 = 110;
    private static final int METHOD_nextFocus111 = 111;
    private static final int METHOD_paint112 = 112;
    private static final int METHOD_paintAll113 = 113;
    private static final int METHOD_paintComponents114 = 114;
    private static final int METHOD_paintImmediately115 = 115;
    private static final int METHOD_paintImmediately116 = 116;
    private static final int METHOD_paste117 = 117;
    private static final int METHOD_postEvent118 = 118;
    private static final int METHOD_preferredSize119 = 119;
    private static final int METHOD_prepareImage120 = 120;
    private static final int METHOD_prepareImage121 = 121;
    private static final int METHOD_print122 = 122;
    private static final int METHOD_print123 = 123;
    private static final int METHOD_print124 = 124;
    private static final int METHOD_print125 = 125;
    private static final int METHOD_printAll126 = 126;
    private static final int METHOD_printComponents127 = 127;
    private static final int METHOD_putClientProperty128 = 128;
    private static final int METHOD_read129 = 129;
    private static final int METHOD_read130 = 130;
    private static final int METHOD_registerEditorKitForContentType131 = 131;
    private static final int METHOD_registerEditorKitForContentType132 = 132;
    private static final int METHOD_registerKeyboardAction133 = 133;
    private static final int METHOD_registerKeyboardAction134 = 134;
    private static final int METHOD_remove135 = 135;
    private static final int METHOD_remove136 = 136;
    private static final int METHOD_remove137 = 137;
    private static final int METHOD_removeAll138 = 138;
    private static final int METHOD_removeKeymap139 = 139;
    private static final int METHOD_removeNotify140 = 140;
    private static final int METHOD_removePropertyChangeListener141 = 141;
    private static final int METHOD_removeStyle142 = 142;
    private static final int METHOD_repaint143 = 143;
    private static final int METHOD_repaint144 = 144;
    private static final int METHOD_repaint145 = 145;
    private static final int METHOD_repaint146 = 146;
    private static final int METHOD_repaint147 = 147;
    private static final int METHOD_replaceSelection148 = 148;
    private static final int METHOD_requestDefaultFocus149 = 149;
    private static final int METHOD_requestFocus150 = 150;
    private static final int METHOD_requestFocus151 = 151;
    private static final int METHOD_requestFocusInWindow152 = 152;
    private static final int METHOD_resetKeyboardActions153 = 153;
    private static final int METHOD_reshape154 = 154;
    private static final int METHOD_resize155 = 155;
    private static final int METHOD_resize156 = 156;
    private static final int METHOD_revalidate157 = 157;
    private static final int METHOD_scrollRectToVisible158 = 158;
    private static final int METHOD_scrollToReference159 = 159;
    private static final int METHOD_select160 = 160;
    private static final int METHOD_selectAll161 = 161;
    private static final int METHOD_setBounds162 = 162;
    private static final int METHOD_setCharacterAttributes163 = 163;
    private static final int METHOD_setComponentZOrder164 = 164;
    private static final int METHOD_setDefaultLocale165 = 165;
    private static final int METHOD_setEditorKitForContentType166 = 166;
    private static final int METHOD_setPage167 = 167;
    private static final int METHOD_setParagraphAttributes168 = 168;
    private static final int METHOD_show169 = 169;
    private static final int METHOD_show170 = 170;
    private static final int METHOD_size171 = 171;
    private static final int METHOD_toString172 = 172;
    private static final int METHOD_transferFocus173 = 173;
    private static final int METHOD_transferFocusBackward174 = 174;
    private static final int METHOD_transferFocusDownCycle175 = 175;
    private static final int METHOD_transferFocusUpCycle176 = 176;
    private static final int METHOD_unregisterKeyboardAction177 = 177;
    private static final int METHOD_update178 = 178;
    private static final int METHOD_updateUI179 = 179;
    private static final int METHOD_validate180 = 180;
    private static final int METHOD_viewToModel181 = 181;
    private static final int METHOD_write182 = 182;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[183];
    
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
            methods[METHOD_addKeymap7] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("addKeymap", new Class[] {java.lang.String.class, javax.swing.text.Keymap.class})); // NOI18N
            methods[METHOD_addKeymap7].setDisplayName ( "" );
            methods[METHOD_addNotify8] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify8].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener9] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener9].setDisplayName ( "" );
            methods[METHOD_addStyle10] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("addStyle", new Class[] {java.lang.String.class, javax.swing.text.Style.class})); // NOI18N
            methods[METHOD_addStyle10].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation11] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation11].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet12] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet12].setDisplayName ( "" );
            methods[METHOD_bounds13] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_checkImage15] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage15].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect16] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_contains18] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains18].setDisplayName ( "" );
            methods[METHOD_copy19] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("copy", new Class[] {})); // NOI18N
            methods[METHOD_copy19].setDisplayName ( "" );
            methods[METHOD_countComponents20] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents20].setDisplayName ( "" );
            methods[METHOD_createEditorKitForContentType21] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("createEditorKitForContentType", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_createEditorKitForContentType21].setDisplayName ( "" );
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
            methods[METHOD_cut27] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("cut", new Class[] {})); // NOI18N
            methods[METHOD_cut27].setDisplayName ( "" );
            methods[METHOD_deliverEvent28] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent28].setDisplayName ( "" );
            methods[METHOD_disable29] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable29].setDisplayName ( "" );
            methods[METHOD_dispatchEvent30] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent30].setDisplayName ( "" );
            methods[METHOD_doLayout31] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enable33] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable33].setDisplayName ( "" );
            methods[METHOD_enableInputMethods34] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_findComponentAt36] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt36].setDisplayName ( "" );
            methods[METHOD_fireHyperlinkUpdate37] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("fireHyperlinkUpdate", new Class[] {javax.swing.event.HyperlinkEvent.class})); // NOI18N
            methods[METHOD_fireHyperlinkUpdate37].setDisplayName ( "" );
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
            methods[METHOD_getEditorKitClassNameForContentType55] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("getEditorKitClassNameForContentType", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getEditorKitClassNameForContentType55].setDisplayName ( "" );
            methods[METHOD_getEditorKitForContentType56] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("getEditorKitForContentType", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getEditorKitForContentType56].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys57] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys57].setDisplayName ( "" );
            methods[METHOD_getFontMetrics58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics58].setDisplayName ( "" );
            methods[METHOD_getInsets59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets59].setDisplayName ( "" );
            methods[METHOD_getKeymap60] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getKeymap60].setDisplayName ( "" );
            methods[METHOD_getListeners61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners61].setDisplayName ( "" );
            methods[METHOD_getLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation62].setDisplayName ( "" );
            methods[METHOD_getMousePosition63] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition63].setDisplayName ( "" );
            methods[METHOD_getPage64] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("getPage", new Class[] {})); // NOI18N
            methods[METHOD_getPage64].setDisplayName ( "" );
            methods[METHOD_getPopupLocation65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation65].setDisplayName ( "" );
            methods[METHOD_getPrintable66] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getPrintable", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_getPrintable66].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners67] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners67].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement68] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement68].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement69] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement69].setDisplayName ( "" );
            methods[METHOD_getSize70] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize70].setDisplayName ( "" );
            methods[METHOD_getStyle71] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("getStyle", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getStyle71].setDisplayName ( "" );
            methods[METHOD_getText72] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getText", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getText72].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation73] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation73].setDisplayName ( "" );
            methods[METHOD_getToolTipText74] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText74].setDisplayName ( "" );
            methods[METHOD_gotFocus75] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus75].setDisplayName ( "" );
            methods[METHOD_grabFocus76] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus76].setDisplayName ( "" );
            methods[METHOD_handleEvent77] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent77].setDisplayName ( "" );
            methods[METHOD_hasFocus78] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus78].setDisplayName ( "" );
            methods[METHOD_hide79] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide79].setDisplayName ( "" );
            methods[METHOD_imageUpdate80] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate80].setDisplayName ( "" );
            methods[METHOD_insertComponent81] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("insertComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_insertComponent81].setDisplayName ( "" );
            methods[METHOD_insertIcon82] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("insertIcon", new Class[] {javax.swing.Icon.class})); // NOI18N
            methods[METHOD_insertIcon82].setDisplayName ( "" );
            methods[METHOD_insets83] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets83].setDisplayName ( "" );
            methods[METHOD_inside84] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside84].setDisplayName ( "" );
            methods[METHOD_invalidate85] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate85].setDisplayName ( "" );
            methods[METHOD_isAncestorOf86] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf86].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot87] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot87].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent88] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent88].setDisplayName ( "" );
            methods[METHOD_keyDown89] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown89].setDisplayName ( "" );
            methods[METHOD_keyUp90] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp90].setDisplayName ( "" );
            methods[METHOD_layout91] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout91].setDisplayName ( "" );
            methods[METHOD_list92] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list92].setDisplayName ( "" );
            methods[METHOD_list93] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list93].setDisplayName ( "" );
            methods[METHOD_list94] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list94].setDisplayName ( "" );
            methods[METHOD_list95] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list95].setDisplayName ( "" );
            methods[METHOD_list96] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list96].setDisplayName ( "" );
            methods[METHOD_loadKeymap97] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("loadKeymap", new Class[] {javax.swing.text.Keymap.class, javax.swing.text.JTextComponent.KeyBinding[].class, javax.swing.Action[].class})); // NOI18N
            methods[METHOD_loadKeymap97].setDisplayName ( "" );
            methods[METHOD_locate98] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate98].setDisplayName ( "" );
            methods[METHOD_location99] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location99].setDisplayName ( "" );
            methods[METHOD_lostFocus100] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus100].setDisplayName ( "" );
            methods[METHOD_minimumSize101] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize101].setDisplayName ( "" );
            methods[METHOD_modelToView102] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("modelToView", new Class[] {int.class})); // NOI18N
            methods[METHOD_modelToView102].setDisplayName ( "" );
            methods[METHOD_mouseDown103] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown103].setDisplayName ( "" );
            methods[METHOD_mouseDrag104] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag104].setDisplayName ( "" );
            methods[METHOD_mouseEnter105] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter105].setDisplayName ( "" );
            methods[METHOD_mouseExit106] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit106].setDisplayName ( "" );
            methods[METHOD_mouseMove107] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove107].setDisplayName ( "" );
            methods[METHOD_mouseUp108] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp108].setDisplayName ( "" );
            methods[METHOD_move109] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move109].setDisplayName ( "" );
            methods[METHOD_moveCaretPosition110] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("moveCaretPosition", new Class[] {int.class})); // NOI18N
            methods[METHOD_moveCaretPosition110].setDisplayName ( "" );
            methods[METHOD_nextFocus111] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus111].setDisplayName ( "" );
            methods[METHOD_paint112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint112].setDisplayName ( "" );
            methods[METHOD_paintAll113] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll113].setDisplayName ( "" );
            methods[METHOD_paintComponents114] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents114].setDisplayName ( "" );
            methods[METHOD_paintImmediately115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately115].setDisplayName ( "" );
            methods[METHOD_paintImmediately116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately116].setDisplayName ( "" );
            methods[METHOD_paste117] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("paste", new Class[] {})); // NOI18N
            methods[METHOD_paste117].setDisplayName ( "" );
            methods[METHOD_postEvent118] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent118].setDisplayName ( "" );
            methods[METHOD_preferredSize119] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize119].setDisplayName ( "" );
            methods[METHOD_prepareImage120] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage120].setDisplayName ( "" );
            methods[METHOD_prepareImage121] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage121].setDisplayName ( "" );
            methods[METHOD_print122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print122].setDisplayName ( "" );
            methods[METHOD_print123] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {})); // NOI18N
            methods[METHOD_print123].setDisplayName ( "" );
            methods[METHOD_print124] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class})); // NOI18N
            methods[METHOD_print124].setDisplayName ( "" );
            methods[METHOD_print125] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("print", new Class[] {java.text.MessageFormat.class, java.text.MessageFormat.class, boolean.class, javax.print.PrintService.class, javax.print.attribute.PrintRequestAttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_print125].setDisplayName ( "" );
            methods[METHOD_printAll126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll126].setDisplayName ( "" );
            methods[METHOD_printComponents127] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents127].setDisplayName ( "" );
            methods[METHOD_putClientProperty128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty128].setDisplayName ( "" );
            methods[METHOD_read129] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("read", new Class[] {java.io.Reader.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_read129].setDisplayName ( "" );
            methods[METHOD_read130] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("read", new Class[] {java.io.InputStream.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_read130].setDisplayName ( "" );
            methods[METHOD_registerEditorKitForContentType131] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("registerEditorKitForContentType", new Class[] {java.lang.String.class, java.lang.String.class})); // NOI18N
            methods[METHOD_registerEditorKitForContentType131].setDisplayName ( "" );
            methods[METHOD_registerEditorKitForContentType132] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("registerEditorKitForContentType", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.ClassLoader.class})); // NOI18N
            methods[METHOD_registerEditorKitForContentType132].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction133].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction134].setDisplayName ( "" );
            methods[METHOD_remove135] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove135].setDisplayName ( "" );
            methods[METHOD_remove136] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove136].setDisplayName ( "" );
            methods[METHOD_remove137] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove137].setDisplayName ( "" );
            methods[METHOD_removeAll138] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll138].setDisplayName ( "" );
            methods[METHOD_removeKeymap139] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeKeymap", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_removeKeymap139].setDisplayName ( "" );
            methods[METHOD_removeNotify140] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify140].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener141] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener141].setDisplayName ( "" );
            methods[METHOD_removeStyle142] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("removeStyle", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_removeStyle142].setDisplayName ( "" );
            methods[METHOD_repaint143] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint143].setDisplayName ( "" );
            methods[METHOD_repaint144] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint144].setDisplayName ( "" );
            methods[METHOD_repaint145] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint145].setDisplayName ( "" );
            methods[METHOD_repaint146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint146].setDisplayName ( "" );
            methods[METHOD_repaint147] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint147].setDisplayName ( "" );
            methods[METHOD_replaceSelection148] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("replaceSelection", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_replaceSelection148].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus149] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus149].setDisplayName ( "" );
            methods[METHOD_requestFocus150] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus150].setDisplayName ( "" );
            methods[METHOD_requestFocus151] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus151].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow152] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow152].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions153] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions153].setDisplayName ( "" );
            methods[METHOD_reshape154] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape154].setDisplayName ( "" );
            methods[METHOD_resize155] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize155].setDisplayName ( "" );
            methods[METHOD_resize156] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize156].setDisplayName ( "" );
            methods[METHOD_revalidate157] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate157].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible158] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible158].setDisplayName ( "" );
            methods[METHOD_scrollToReference159] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("scrollToReference", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_scrollToReference159].setDisplayName ( "" );
            methods[METHOD_select160] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("select", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_select160].setDisplayName ( "" );
            methods[METHOD_selectAll161] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("selectAll", new Class[] {})); // NOI18N
            methods[METHOD_selectAll161].setDisplayName ( "" );
            methods[METHOD_setBounds162] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds162].setDisplayName ( "" );
            methods[METHOD_setCharacterAttributes163] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("setCharacterAttributes", new Class[] {javax.swing.text.AttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_setCharacterAttributes163].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder164] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder164].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale165] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale165].setDisplayName ( "" );
            methods[METHOD_setEditorKitForContentType166] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("setEditorKitForContentType", new Class[] {java.lang.String.class, javax.swing.text.EditorKit.class})); // NOI18N
            methods[METHOD_setEditorKitForContentType166].setDisplayName ( "" );
            methods[METHOD_setPage167] = new MethodDescriptor(javax.swing.JEditorPane.class.getMethod("setPage", new Class[] {java.net.URL.class})); // NOI18N
            methods[METHOD_setPage167].setDisplayName ( "" );
            methods[METHOD_setParagraphAttributes168] = new MethodDescriptor(javax.swing.JTextPane.class.getMethod("setParagraphAttributes", new Class[] {javax.swing.text.AttributeSet.class, boolean.class})); // NOI18N
            methods[METHOD_setParagraphAttributes168].setDisplayName ( "" );
            methods[METHOD_show169] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show169].setDisplayName ( "" );
            methods[METHOD_show170] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show170].setDisplayName ( "" );
            methods[METHOD_size171] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size171].setDisplayName ( "" );
            methods[METHOD_toString172] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString172].setDisplayName ( "" );
            methods[METHOD_transferFocus173] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus173].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward174] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward174].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle175] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle175].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle176] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle176].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction177] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction177].setDisplayName ( "" );
            methods[METHOD_update178] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update178].setDisplayName ( "" );
            methods[METHOD_updateUI179] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI179].setDisplayName ( "" );
            methods[METHOD_validate180] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate180].setDisplayName ( "" );
            methods[METHOD_viewToModel181] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("viewToModel", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_viewToModel181].setDisplayName ( "" );
            methods[METHOD_write182] = new MethodDescriptor(javax.swing.text.JTextComponent.class.getMethod("write", new Class[] {java.io.Writer.class})); // NOI18N
            methods[METHOD_write182].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/py/com/oym/widgets/icons/JTextPane.jpg";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/py/com/oym/widgets/icons/JTextPane.jpg";
    private static String iconNameM16 = "/py/com/oym/widgets/icons/JTextPane.jpg";
    private static String iconNameM32 = "/py/com/oym/widgets/icons/JTextPane.jpg";//GEN-END:Icons

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
