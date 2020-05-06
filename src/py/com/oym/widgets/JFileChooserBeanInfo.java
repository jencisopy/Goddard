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
public class JFileChooserBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( py.com.oym.widgets.JFileChooser.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_acceptAllFileFilter = 0;
    private static final int PROPERTY_acceptAllFileFilterUsed = 1;
    private static final int PROPERTY_accessibleContext = 2;
    private static final int PROPERTY_accessory = 3;
    private static final int PROPERTY_actionListeners = 4;
    private static final int PROPERTY_actionMap = 5;
    private static final int PROPERTY_alignmentX = 6;
    private static final int PROPERTY_alignmentY = 7;
    private static final int PROPERTY_ancestorListeners = 8;
    private static final int PROPERTY_approveButtonMnemonic = 9;
    private static final int PROPERTY_approveButtonText = 10;
    private static final int PROPERTY_approveButtonToolTipText = 11;
    private static final int PROPERTY_autoscrolls = 12;
    private static final int PROPERTY_background = 13;
    private static final int PROPERTY_backgroundSet = 14;
    private static final int PROPERTY_baselineResizeBehavior = 15;
    private static final int PROPERTY_border = 16;
    private static final int PROPERTY_bounds = 17;
    private static final int PROPERTY_choosableFileFilters = 18;
    private static final int PROPERTY_colorModel = 19;
    private static final int PROPERTY_component = 20;
    private static final int PROPERTY_componentCount = 21;
    private static final int PROPERTY_componentListeners = 22;
    private static final int PROPERTY_componentOrientation = 23;
    private static final int PROPERTY_componentPopupMenu = 24;
    private static final int PROPERTY_components = 25;
    private static final int PROPERTY_containerListeners = 26;
    private static final int PROPERTY_controlButtonsAreShown = 27;
    private static final int PROPERTY_currentDirectory = 28;
    private static final int PROPERTY_cursor = 29;
    private static final int PROPERTY_cursorSet = 30;
    private static final int PROPERTY_debugGraphicsOptions = 31;
    private static final int PROPERTY_dialogTitle = 32;
    private static final int PROPERTY_dialogType = 33;
    private static final int PROPERTY_directorySelectionEnabled = 34;
    private static final int PROPERTY_displayable = 35;
    private static final int PROPERTY_doubleBuffered = 36;
    private static final int PROPERTY_dragEnabled = 37;
    private static final int PROPERTY_dropTarget = 38;
    private static final int PROPERTY_enabled = 39;
    private static final int PROPERTY_fileFilter = 40;
    private static final int PROPERTY_fileHidingEnabled = 41;
    private static final int PROPERTY_fileSelectionEnabled = 42;
    private static final int PROPERTY_fileSelectionMode = 43;
    private static final int PROPERTY_fileSystemView = 44;
    private static final int PROPERTY_fileView = 45;
    private static final int PROPERTY_focusable = 46;
    private static final int PROPERTY_focusCycleRoot = 47;
    private static final int PROPERTY_focusCycleRootAncestor = 48;
    private static final int PROPERTY_focusListeners = 49;
    private static final int PROPERTY_focusOwner = 50;
    private static final int PROPERTY_focusTraversable = 51;
    private static final int PROPERTY_focusTraversalKeys = 52;
    private static final int PROPERTY_focusTraversalKeysEnabled = 53;
    private static final int PROPERTY_focusTraversalPolicy = 54;
    private static final int PROPERTY_focusTraversalPolicyProvider = 55;
    private static final int PROPERTY_focusTraversalPolicySet = 56;
    private static final int PROPERTY_font = 57;
    private static final int PROPERTY_fontSet = 58;
    private static final int PROPERTY_foreground = 59;
    private static final int PROPERTY_foregroundSet = 60;
    private static final int PROPERTY_graphics = 61;
    private static final int PROPERTY_graphicsConfiguration = 62;
    private static final int PROPERTY_height = 63;
    private static final int PROPERTY_hierarchyBoundsListeners = 64;
    private static final int PROPERTY_hierarchyListeners = 65;
    private static final int PROPERTY_ignoreRepaint = 66;
    private static final int PROPERTY_inheritsPopupMenu = 67;
    private static final int PROPERTY_inputContext = 68;
    private static final int PROPERTY_inputMap = 69;
    private static final int PROPERTY_inputMethodListeners = 70;
    private static final int PROPERTY_inputMethodRequests = 71;
    private static final int PROPERTY_inputVerifier = 72;
    private static final int PROPERTY_insets = 73;
    private static final int PROPERTY_keyListeners = 74;
    private static final int PROPERTY_layout = 75;
    private static final int PROPERTY_lightweight = 76;
    private static final int PROPERTY_locale = 77;
    private static final int PROPERTY_location = 78;
    private static final int PROPERTY_locationOnScreen = 79;
    private static final int PROPERTY_managingFocus = 80;
    private static final int PROPERTY_maximumSize = 81;
    private static final int PROPERTY_maximumSizeSet = 82;
    private static final int PROPERTY_minimumSize = 83;
    private static final int PROPERTY_minimumSizeSet = 84;
    private static final int PROPERTY_mouseListeners = 85;
    private static final int PROPERTY_mouseMotionListeners = 86;
    private static final int PROPERTY_mousePosition = 87;
    private static final int PROPERTY_mouseWheelListeners = 88;
    private static final int PROPERTY_multiSelectionEnabled = 89;
    private static final int PROPERTY_name = 90;
    private static final int PROPERTY_nextFocusableComponent = 91;
    private static final int PROPERTY_opaque = 92;
    private static final int PROPERTY_optimizedDrawingEnabled = 93;
    private static final int PROPERTY_paintingForPrint = 94;
    private static final int PROPERTY_paintingTile = 95;
    private static final int PROPERTY_parent = 96;
    private static final int PROPERTY_peer = 97;
    private static final int PROPERTY_preferredSize = 98;
    private static final int PROPERTY_preferredSizeSet = 99;
    private static final int PROPERTY_propertyChangeListeners = 100;
    private static final int PROPERTY_registeredKeyStrokes = 101;
    private static final int PROPERTY_requestFocusEnabled = 102;
    private static final int PROPERTY_rootPane = 103;
    private static final int PROPERTY_selectedFile = 104;
    private static final int PROPERTY_selectedFiles = 105;
    private static final int PROPERTY_showing = 106;
    private static final int PROPERTY_size = 107;
    private static final int PROPERTY_toolkit = 108;
    private static final int PROPERTY_toolTipText = 109;
    private static final int PROPERTY_topLevelAncestor = 110;
    private static final int PROPERTY_transferHandler = 111;
    private static final int PROPERTY_treeLock = 112;
    private static final int PROPERTY_UI = 113;
    private static final int PROPERTY_UIClassID = 114;
    private static final int PROPERTY_valid = 115;
    private static final int PROPERTY_validateRoot = 116;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 117;
    private static final int PROPERTY_vetoableChangeListeners = 118;
    private static final int PROPERTY_visible = 119;
    private static final int PROPERTY_visibleRect = 120;
    private static final int PROPERTY_width = 121;
    private static final int PROPERTY_x = 122;
    private static final int PROPERTY_y = 123;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[124];
    
        try {
            properties[PROPERTY_acceptAllFileFilter] = new PropertyDescriptor ( "acceptAllFileFilter", py.com.oym.widgets.JFileChooser.class, "getAcceptAllFileFilter", null ); // NOI18N
            properties[PROPERTY_acceptAllFileFilterUsed] = new PropertyDescriptor ( "acceptAllFileFilterUsed", py.com.oym.widgets.JFileChooser.class, "isAcceptAllFileFilterUsed", "setAcceptAllFileFilterUsed" ); // NOI18N
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", py.com.oym.widgets.JFileChooser.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_accessory] = new PropertyDescriptor ( "accessory", py.com.oym.widgets.JFileChooser.class, "getAccessory", "setAccessory" ); // NOI18N
            properties[PROPERTY_actionListeners] = new PropertyDescriptor ( "actionListeners", py.com.oym.widgets.JFileChooser.class, "getActionListeners", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", py.com.oym.widgets.JFileChooser.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", py.com.oym.widgets.JFileChooser.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", py.com.oym.widgets.JFileChooser.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", py.com.oym.widgets.JFileChooser.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_approveButtonMnemonic] = new PropertyDescriptor ( "approveButtonMnemonic", py.com.oym.widgets.JFileChooser.class, null, "setApproveButtonMnemonic" ); // NOI18N
            properties[PROPERTY_approveButtonText] = new PropertyDescriptor ( "approveButtonText", py.com.oym.widgets.JFileChooser.class, "getApproveButtonText", "setApproveButtonText" ); // NOI18N
            properties[PROPERTY_approveButtonToolTipText] = new PropertyDescriptor ( "approveButtonToolTipText", py.com.oym.widgets.JFileChooser.class, "getApproveButtonToolTipText", "setApproveButtonToolTipText" ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", py.com.oym.widgets.JFileChooser.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", py.com.oym.widgets.JFileChooser.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", py.com.oym.widgets.JFileChooser.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", py.com.oym.widgets.JFileChooser.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", py.com.oym.widgets.JFileChooser.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", py.com.oym.widgets.JFileChooser.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_choosableFileFilters] = new PropertyDescriptor ( "choosableFileFilters", py.com.oym.widgets.JFileChooser.class, "getChoosableFileFilters", null ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", py.com.oym.widgets.JFileChooser.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", py.com.oym.widgets.JFileChooser.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", py.com.oym.widgets.JFileChooser.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", py.com.oym.widgets.JFileChooser.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", py.com.oym.widgets.JFileChooser.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", py.com.oym.widgets.JFileChooser.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", py.com.oym.widgets.JFileChooser.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", py.com.oym.widgets.JFileChooser.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_controlButtonsAreShown] = new PropertyDescriptor ( "controlButtonsAreShown", py.com.oym.widgets.JFileChooser.class, "getControlButtonsAreShown", "setControlButtonsAreShown" ); // NOI18N
            properties[PROPERTY_currentDirectory] = new PropertyDescriptor ( "currentDirectory", py.com.oym.widgets.JFileChooser.class, "getCurrentDirectory", "setCurrentDirectory" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", py.com.oym.widgets.JFileChooser.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", py.com.oym.widgets.JFileChooser.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", py.com.oym.widgets.JFileChooser.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_dialogTitle] = new PropertyDescriptor ( "dialogTitle", py.com.oym.widgets.JFileChooser.class, "getDialogTitle", "setDialogTitle" ); // NOI18N
            properties[PROPERTY_dialogType] = new PropertyDescriptor ( "dialogType", py.com.oym.widgets.JFileChooser.class, "getDialogType", "setDialogType" ); // NOI18N
            properties[PROPERTY_directorySelectionEnabled] = new PropertyDescriptor ( "directorySelectionEnabled", py.com.oym.widgets.JFileChooser.class, "isDirectorySelectionEnabled", null ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", py.com.oym.widgets.JFileChooser.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", py.com.oym.widgets.JFileChooser.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dragEnabled] = new PropertyDescriptor ( "dragEnabled", py.com.oym.widgets.JFileChooser.class, "getDragEnabled", "setDragEnabled" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", py.com.oym.widgets.JFileChooser.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", py.com.oym.widgets.JFileChooser.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_fileFilter] = new PropertyDescriptor ( "fileFilter", py.com.oym.widgets.JFileChooser.class, "getFileFilter", "setFileFilter" ); // NOI18N
            properties[PROPERTY_fileHidingEnabled] = new PropertyDescriptor ( "fileHidingEnabled", py.com.oym.widgets.JFileChooser.class, "isFileHidingEnabled", "setFileHidingEnabled" ); // NOI18N
            properties[PROPERTY_fileSelectionEnabled] = new PropertyDescriptor ( "fileSelectionEnabled", py.com.oym.widgets.JFileChooser.class, "isFileSelectionEnabled", null ); // NOI18N
            properties[PROPERTY_fileSelectionMode] = new PropertyDescriptor ( "fileSelectionMode", py.com.oym.widgets.JFileChooser.class, "getFileSelectionMode", "setFileSelectionMode" ); // NOI18N
            properties[PROPERTY_fileSystemView] = new PropertyDescriptor ( "fileSystemView", py.com.oym.widgets.JFileChooser.class, "getFileSystemView", "setFileSystemView" ); // NOI18N
            properties[PROPERTY_fileView] = new PropertyDescriptor ( "fileView", py.com.oym.widgets.JFileChooser.class, "getFileView", "setFileView" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", py.com.oym.widgets.JFileChooser.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", py.com.oym.widgets.JFileChooser.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", py.com.oym.widgets.JFileChooser.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", py.com.oym.widgets.JFileChooser.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", py.com.oym.widgets.JFileChooser.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", py.com.oym.widgets.JFileChooser.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", py.com.oym.widgets.JFileChooser.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", py.com.oym.widgets.JFileChooser.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", py.com.oym.widgets.JFileChooser.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", py.com.oym.widgets.JFileChooser.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", py.com.oym.widgets.JFileChooser.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", py.com.oym.widgets.JFileChooser.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", py.com.oym.widgets.JFileChooser.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", py.com.oym.widgets.JFileChooser.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", py.com.oym.widgets.JFileChooser.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", py.com.oym.widgets.JFileChooser.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", py.com.oym.widgets.JFileChooser.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", py.com.oym.widgets.JFileChooser.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", py.com.oym.widgets.JFileChooser.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", py.com.oym.widgets.JFileChooser.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", py.com.oym.widgets.JFileChooser.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", py.com.oym.widgets.JFileChooser.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", py.com.oym.widgets.JFileChooser.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", py.com.oym.widgets.JFileChooser.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", py.com.oym.widgets.JFileChooser.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", py.com.oym.widgets.JFileChooser.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", py.com.oym.widgets.JFileChooser.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", py.com.oym.widgets.JFileChooser.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", py.com.oym.widgets.JFileChooser.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", py.com.oym.widgets.JFileChooser.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", py.com.oym.widgets.JFileChooser.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", py.com.oym.widgets.JFileChooser.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", py.com.oym.widgets.JFileChooser.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", py.com.oym.widgets.JFileChooser.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", py.com.oym.widgets.JFileChooser.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", py.com.oym.widgets.JFileChooser.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", py.com.oym.widgets.JFileChooser.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", py.com.oym.widgets.JFileChooser.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", py.com.oym.widgets.JFileChooser.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", py.com.oym.widgets.JFileChooser.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", py.com.oym.widgets.JFileChooser.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", py.com.oym.widgets.JFileChooser.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", py.com.oym.widgets.JFileChooser.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_multiSelectionEnabled] = new PropertyDescriptor ( "multiSelectionEnabled", py.com.oym.widgets.JFileChooser.class, "isMultiSelectionEnabled", "setMultiSelectionEnabled" ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", py.com.oym.widgets.JFileChooser.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", py.com.oym.widgets.JFileChooser.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", py.com.oym.widgets.JFileChooser.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", py.com.oym.widgets.JFileChooser.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", py.com.oym.widgets.JFileChooser.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", py.com.oym.widgets.JFileChooser.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", py.com.oym.widgets.JFileChooser.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", py.com.oym.widgets.JFileChooser.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", py.com.oym.widgets.JFileChooser.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", py.com.oym.widgets.JFileChooser.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", py.com.oym.widgets.JFileChooser.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", py.com.oym.widgets.JFileChooser.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", py.com.oym.widgets.JFileChooser.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", py.com.oym.widgets.JFileChooser.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_selectedFile] = new PropertyDescriptor ( "selectedFile", py.com.oym.widgets.JFileChooser.class, "getSelectedFile", "setSelectedFile" ); // NOI18N
            properties[PROPERTY_selectedFiles] = new PropertyDescriptor ( "selectedFiles", py.com.oym.widgets.JFileChooser.class, "getSelectedFiles", "setSelectedFiles" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", py.com.oym.widgets.JFileChooser.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", py.com.oym.widgets.JFileChooser.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", py.com.oym.widgets.JFileChooser.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", py.com.oym.widgets.JFileChooser.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", py.com.oym.widgets.JFileChooser.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", py.com.oym.widgets.JFileChooser.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", py.com.oym.widgets.JFileChooser.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", py.com.oym.widgets.JFileChooser.class, "getUI", null ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", py.com.oym.widgets.JFileChooser.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", py.com.oym.widgets.JFileChooser.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", py.com.oym.widgets.JFileChooser.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", py.com.oym.widgets.JFileChooser.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", py.com.oym.widgets.JFileChooser.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", py.com.oym.widgets.JFileChooser.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", py.com.oym.widgets.JFileChooser.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", py.com.oym.widgets.JFileChooser.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", py.com.oym.widgets.JFileChooser.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", py.com.oym.widgets.JFileChooser.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_actionListener = 0;
    private static final int EVENT_ancestorListener = 1;
    private static final int EVENT_componentListener = 2;
    private static final int EVENT_containerListener = 3;
    private static final int EVENT_focusListener = 4;
    private static final int EVENT_hierarchyBoundsListener = 5;
    private static final int EVENT_hierarchyListener = 6;
    private static final int EVENT_inputMethodListener = 7;
    private static final int EVENT_keyListener = 8;
    private static final int EVENT_mouseListener = 9;
    private static final int EVENT_mouseMotionListener = 10;
    private static final int EVENT_mouseWheelListener = 11;
    private static final int EVENT_propertyChangeListener = 12;
    private static final int EVENT_vetoableChangeListener = 13;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[14];
    
        try {
            eventSets[EVENT_actionListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "actionListener", java.awt.event.ActionListener.class, new String[] {"actionPerformed"}, "addActionListener", "removeActionListener" ); // NOI18N
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( py.com.oym.widgets.JFileChooser.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_accept0 = 0;
    private static final int METHOD_action1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_add7 = 7;
    private static final int METHOD_addChoosableFileFilter8 = 8;
    private static final int METHOD_addNotify9 = 9;
    private static final int METHOD_addPropertyChangeListener10 = 10;
    private static final int METHOD_applyComponentOrientation11 = 11;
    private static final int METHOD_approveSelection12 = 12;
    private static final int METHOD_areFocusTraversalKeysSet13 = 13;
    private static final int METHOD_bounds14 = 14;
    private static final int METHOD_cancelSelection15 = 15;
    private static final int METHOD_changeToParentDirectory16 = 16;
    private static final int METHOD_checkImage17 = 17;
    private static final int METHOD_checkImage18 = 18;
    private static final int METHOD_computeVisibleRect19 = 19;
    private static final int METHOD_contains20 = 20;
    private static final int METHOD_contains21 = 21;
    private static final int METHOD_countComponents22 = 22;
    private static final int METHOD_createImage23 = 23;
    private static final int METHOD_createImage24 = 24;
    private static final int METHOD_createToolTip25 = 25;
    private static final int METHOD_createVolatileImage26 = 26;
    private static final int METHOD_createVolatileImage27 = 27;
    private static final int METHOD_deliverEvent28 = 28;
    private static final int METHOD_disable29 = 29;
    private static final int METHOD_dispatchEvent30 = 30;
    private static final int METHOD_doLayout31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enable33 = 33;
    private static final int METHOD_enableInputMethods34 = 34;
    private static final int METHOD_ensureFileIsVisible35 = 35;
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
    private static final int METHOD_getApproveButtonMnemonic47 = 47;
    private static final int METHOD_getBaseline48 = 48;
    private static final int METHOD_getBounds49 = 49;
    private static final int METHOD_getClientProperty50 = 50;
    private static final int METHOD_getComponentAt51 = 51;
    private static final int METHOD_getComponentAt52 = 52;
    private static final int METHOD_getComponentZOrder53 = 53;
    private static final int METHOD_getConditionForKeyStroke54 = 54;
    private static final int METHOD_getDefaultLocale55 = 55;
    private static final int METHOD_getDescription56 = 56;
    private static final int METHOD_getFocusTraversalKeys57 = 57;
    private static final int METHOD_getFontMetrics58 = 58;
    private static final int METHOD_getIcon59 = 59;
    private static final int METHOD_getInsets60 = 60;
    private static final int METHOD_getListeners61 = 61;
    private static final int METHOD_getLocation62 = 62;
    private static final int METHOD_getMousePosition63 = 63;
    private static final int METHOD_getName64 = 64;
    private static final int METHOD_getPopupLocation65 = 65;
    private static final int METHOD_getPropertyChangeListeners66 = 66;
    private static final int METHOD_getSize67 = 67;
    private static final int METHOD_getToolTipLocation68 = 68;
    private static final int METHOD_getToolTipText69 = 69;
    private static final int METHOD_getTypeDescription70 = 70;
    private static final int METHOD_gotFocus71 = 71;
    private static final int METHOD_grabFocus72 = 72;
    private static final int METHOD_handleEvent73 = 73;
    private static final int METHOD_hasFocus74 = 74;
    private static final int METHOD_hide75 = 75;
    private static final int METHOD_imageUpdate76 = 76;
    private static final int METHOD_insets77 = 77;
    private static final int METHOD_inside78 = 78;
    private static final int METHOD_invalidate79 = 79;
    private static final int METHOD_isAncestorOf80 = 80;
    private static final int METHOD_isFocusCycleRoot81 = 81;
    private static final int METHOD_isLightweightComponent82 = 82;
    private static final int METHOD_isTraversable83 = 83;
    private static final int METHOD_keyDown84 = 84;
    private static final int METHOD_keyUp85 = 85;
    private static final int METHOD_layout86 = 86;
    private static final int METHOD_list87 = 87;
    private static final int METHOD_list88 = 88;
    private static final int METHOD_list89 = 89;
    private static final int METHOD_list90 = 90;
    private static final int METHOD_list91 = 91;
    private static final int METHOD_locate92 = 92;
    private static final int METHOD_location93 = 93;
    private static final int METHOD_lostFocus94 = 94;
    private static final int METHOD_minimumSize95 = 95;
    private static final int METHOD_mouseDown96 = 96;
    private static final int METHOD_mouseDrag97 = 97;
    private static final int METHOD_mouseEnter98 = 98;
    private static final int METHOD_mouseExit99 = 99;
    private static final int METHOD_mouseMove100 = 100;
    private static final int METHOD_mouseUp101 = 101;
    private static final int METHOD_move102 = 102;
    private static final int METHOD_nextFocus103 = 103;
    private static final int METHOD_paint104 = 104;
    private static final int METHOD_paintAll105 = 105;
    private static final int METHOD_paintComponents106 = 106;
    private static final int METHOD_paintImmediately107 = 107;
    private static final int METHOD_paintImmediately108 = 108;
    private static final int METHOD_postEvent109 = 109;
    private static final int METHOD_preferredSize110 = 110;
    private static final int METHOD_prepareImage111 = 111;
    private static final int METHOD_prepareImage112 = 112;
    private static final int METHOD_print113 = 113;
    private static final int METHOD_printAll114 = 114;
    private static final int METHOD_printComponents115 = 115;
    private static final int METHOD_putClientProperty116 = 116;
    private static final int METHOD_registerKeyboardAction117 = 117;
    private static final int METHOD_registerKeyboardAction118 = 118;
    private static final int METHOD_remove119 = 119;
    private static final int METHOD_remove120 = 120;
    private static final int METHOD_remove121 = 121;
    private static final int METHOD_removeAll122 = 122;
    private static final int METHOD_removeChoosableFileFilter123 = 123;
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
    private static final int METHOD_rescanCurrentDirectory135 = 135;
    private static final int METHOD_resetChoosableFileFilters136 = 136;
    private static final int METHOD_resetKeyboardActions137 = 137;
    private static final int METHOD_reshape138 = 138;
    private static final int METHOD_resize139 = 139;
    private static final int METHOD_resize140 = 140;
    private static final int METHOD_revalidate141 = 141;
    private static final int METHOD_scrollRectToVisible142 = 142;
    private static final int METHOD_setApproveButtonMnemonic143 = 143;
    private static final int METHOD_setBounds144 = 144;
    private static final int METHOD_setComponentZOrder145 = 145;
    private static final int METHOD_setDefaultLocale146 = 146;
    private static final int METHOD_show147 = 147;
    private static final int METHOD_show148 = 148;
    private static final int METHOD_showDialog149 = 149;
    private static final int METHOD_showOpenDialog150 = 150;
    private static final int METHOD_showSaveDialog151 = 151;
    private static final int METHOD_size152 = 152;
    private static final int METHOD_toString153 = 153;
    private static final int METHOD_transferFocus154 = 154;
    private static final int METHOD_transferFocusBackward155 = 155;
    private static final int METHOD_transferFocusDownCycle156 = 156;
    private static final int METHOD_transferFocusUpCycle157 = 157;
    private static final int METHOD_unregisterKeyboardAction158 = 158;
    private static final int METHOD_update159 = 159;
    private static final int METHOD_updateUI160 = 160;
    private static final int METHOD_validate161 = 161;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[162];
    
        try {
            methods[METHOD_accept0] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("accept", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_accept0].setDisplayName ( "" );
            methods[METHOD_action1] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_add7] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add7].setDisplayName ( "" );
            methods[METHOD_addChoosableFileFilter8] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("addChoosableFileFilter", new Class[] {javax.swing.filechooser.FileFilter.class})); // NOI18N
            methods[METHOD_addChoosableFileFilter8].setDisplayName ( "" );
            methods[METHOD_addNotify9] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify9].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener10] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener10].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation11] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation11].setDisplayName ( "" );
            methods[METHOD_approveSelection12] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("approveSelection", new Class[] {})); // NOI18N
            methods[METHOD_approveSelection12].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet13] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet13].setDisplayName ( "" );
            methods[METHOD_bounds14] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds14].setDisplayName ( "" );
            methods[METHOD_cancelSelection15] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("cancelSelection", new Class[] {})); // NOI18N
            methods[METHOD_cancelSelection15].setDisplayName ( "" );
            methods[METHOD_changeToParentDirectory16] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("changeToParentDirectory", new Class[] {})); // NOI18N
            methods[METHOD_changeToParentDirectory16].setDisplayName ( "" );
            methods[METHOD_checkImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage17].setDisplayName ( "" );
            methods[METHOD_checkImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage18].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect19] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect19].setDisplayName ( "" );
            methods[METHOD_contains20] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains20].setDisplayName ( "" );
            methods[METHOD_contains21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains21].setDisplayName ( "" );
            methods[METHOD_countComponents22] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents22].setDisplayName ( "" );
            methods[METHOD_createImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage23].setDisplayName ( "" );
            methods[METHOD_createImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage24].setDisplayName ( "" );
            methods[METHOD_createToolTip25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip25].setDisplayName ( "" );
            methods[METHOD_createVolatileImage26] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage26].setDisplayName ( "" );
            methods[METHOD_createVolatileImage27] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage27].setDisplayName ( "" );
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
            methods[METHOD_ensureFileIsVisible35] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("ensureFileIsVisible", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_ensureFileIsVisible35].setDisplayName ( "" );
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
            methods[METHOD_getApproveButtonMnemonic47] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("getApproveButtonMnemonic", new Class[] {})); // NOI18N
            methods[METHOD_getApproveButtonMnemonic47].setDisplayName ( "" );
            methods[METHOD_getBaseline48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline48].setDisplayName ( "" );
            methods[METHOD_getBounds49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds49].setDisplayName ( "" );
            methods[METHOD_getClientProperty50] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty50].setDisplayName ( "" );
            methods[METHOD_getComponentAt51] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt51].setDisplayName ( "" );
            methods[METHOD_getComponentAt52] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt52].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder53] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder53].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke54].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale55].setDisplayName ( "" );
            methods[METHOD_getDescription56] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("getDescription", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_getDescription56].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys57] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys57].setDisplayName ( "" );
            methods[METHOD_getFontMetrics58] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics58].setDisplayName ( "" );
            methods[METHOD_getIcon59] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("getIcon", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_getIcon59].setDisplayName ( "" );
            methods[METHOD_getInsets60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets60].setDisplayName ( "" );
            methods[METHOD_getListeners61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners61].setDisplayName ( "" );
            methods[METHOD_getLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation62].setDisplayName ( "" );
            methods[METHOD_getMousePosition63] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition63].setDisplayName ( "" );
            methods[METHOD_getName64] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("getName", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_getName64].setDisplayName ( "" );
            methods[METHOD_getPopupLocation65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation65].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners66] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners66].setDisplayName ( "" );
            methods[METHOD_getSize67] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize67].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation68] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation68].setDisplayName ( "" );
            methods[METHOD_getToolTipText69] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText69].setDisplayName ( "" );
            methods[METHOD_getTypeDescription70] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("getTypeDescription", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_getTypeDescription70].setDisplayName ( "" );
            methods[METHOD_gotFocus71] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus71].setDisplayName ( "" );
            methods[METHOD_grabFocus72] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus72].setDisplayName ( "" );
            methods[METHOD_handleEvent73] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent73].setDisplayName ( "" );
            methods[METHOD_hasFocus74] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus74].setDisplayName ( "" );
            methods[METHOD_hide75] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide75].setDisplayName ( "" );
            methods[METHOD_imageUpdate76] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate76].setDisplayName ( "" );
            methods[METHOD_insets77] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets77].setDisplayName ( "" );
            methods[METHOD_inside78] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside78].setDisplayName ( "" );
            methods[METHOD_invalidate79] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate79].setDisplayName ( "" );
            methods[METHOD_isAncestorOf80] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf80].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot81] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot81].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent82] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent82].setDisplayName ( "" );
            methods[METHOD_isTraversable83] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("isTraversable", new Class[] {java.io.File.class})); // NOI18N
            methods[METHOD_isTraversable83].setDisplayName ( "" );
            methods[METHOD_keyDown84] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown84].setDisplayName ( "" );
            methods[METHOD_keyUp85] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp85].setDisplayName ( "" );
            methods[METHOD_layout86] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout86].setDisplayName ( "" );
            methods[METHOD_list87] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list87].setDisplayName ( "" );
            methods[METHOD_list88] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list88].setDisplayName ( "" );
            methods[METHOD_list89] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list89].setDisplayName ( "" );
            methods[METHOD_list90] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list90].setDisplayName ( "" );
            methods[METHOD_list91] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list91].setDisplayName ( "" );
            methods[METHOD_locate92] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate92].setDisplayName ( "" );
            methods[METHOD_location93] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location93].setDisplayName ( "" );
            methods[METHOD_lostFocus94] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus94].setDisplayName ( "" );
            methods[METHOD_minimumSize95] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize95].setDisplayName ( "" );
            methods[METHOD_mouseDown96] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown96].setDisplayName ( "" );
            methods[METHOD_mouseDrag97] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag97].setDisplayName ( "" );
            methods[METHOD_mouseEnter98] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter98].setDisplayName ( "" );
            methods[METHOD_mouseExit99] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit99].setDisplayName ( "" );
            methods[METHOD_mouseMove100] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove100].setDisplayName ( "" );
            methods[METHOD_mouseUp101] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp101].setDisplayName ( "" );
            methods[METHOD_move102] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move102].setDisplayName ( "" );
            methods[METHOD_nextFocus103] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus103].setDisplayName ( "" );
            methods[METHOD_paint104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint104].setDisplayName ( "" );
            methods[METHOD_paintAll105] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll105].setDisplayName ( "" );
            methods[METHOD_paintComponents106] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents106].setDisplayName ( "" );
            methods[METHOD_paintImmediately107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately107].setDisplayName ( "" );
            methods[METHOD_paintImmediately108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately108].setDisplayName ( "" );
            methods[METHOD_postEvent109] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent109].setDisplayName ( "" );
            methods[METHOD_preferredSize110] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize110].setDisplayName ( "" );
            methods[METHOD_prepareImage111] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage111].setDisplayName ( "" );
            methods[METHOD_prepareImage112] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage112].setDisplayName ( "" );
            methods[METHOD_print113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print113].setDisplayName ( "" );
            methods[METHOD_printAll114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll114].setDisplayName ( "" );
            methods[METHOD_printComponents115] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents115].setDisplayName ( "" );
            methods[METHOD_putClientProperty116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty116].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction117].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction118] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction118].setDisplayName ( "" );
            methods[METHOD_remove119] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove119].setDisplayName ( "" );
            methods[METHOD_remove120] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove120].setDisplayName ( "" );
            methods[METHOD_remove121] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove121].setDisplayName ( "" );
            methods[METHOD_removeAll122] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll122].setDisplayName ( "" );
            methods[METHOD_removeChoosableFileFilter123] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("removeChoosableFileFilter", new Class[] {javax.swing.filechooser.FileFilter.class})); // NOI18N
            methods[METHOD_removeChoosableFileFilter123].setDisplayName ( "" );
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
            methods[METHOD_rescanCurrentDirectory135] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("rescanCurrentDirectory", new Class[] {})); // NOI18N
            methods[METHOD_rescanCurrentDirectory135].setDisplayName ( "" );
            methods[METHOD_resetChoosableFileFilters136] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("resetChoosableFileFilters", new Class[] {})); // NOI18N
            methods[METHOD_resetChoosableFileFilters136].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions137] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions137].setDisplayName ( "" );
            methods[METHOD_reshape138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape138].setDisplayName ( "" );
            methods[METHOD_resize139] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize139].setDisplayName ( "" );
            methods[METHOD_resize140] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize140].setDisplayName ( "" );
            methods[METHOD_revalidate141] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate141].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible142] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible142].setDisplayName ( "" );
            methods[METHOD_setApproveButtonMnemonic143] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("setApproveButtonMnemonic", new Class[] {int.class})); // NOI18N
            methods[METHOD_setApproveButtonMnemonic143].setDisplayName ( "" );
            methods[METHOD_setBounds144] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds144].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder145] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder145].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale146].setDisplayName ( "" );
            methods[METHOD_show147] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show147].setDisplayName ( "" );
            methods[METHOD_show148] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show148].setDisplayName ( "" );
            methods[METHOD_showDialog149] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("showDialog", new Class[] {java.awt.Component.class, java.lang.String.class})); // NOI18N
            methods[METHOD_showDialog149].setDisplayName ( "" );
            methods[METHOD_showOpenDialog150] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("showOpenDialog", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_showOpenDialog150].setDisplayName ( "" );
            methods[METHOD_showSaveDialog151] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("showSaveDialog", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_showSaveDialog151].setDisplayName ( "" );
            methods[METHOD_size152] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size152].setDisplayName ( "" );
            methods[METHOD_toString153] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString153].setDisplayName ( "" );
            methods[METHOD_transferFocus154] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus154].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward155] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward155].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle156] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle156].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle157] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle157].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction158] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction158].setDisplayName ( "" );
            methods[METHOD_update159] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update159].setDisplayName ( "" );
            methods[METHOD_updateUI160] = new MethodDescriptor(javax.swing.JFileChooser.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI160].setDisplayName ( "" );
            methods[METHOD_validate161] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate161].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = "/py/com/oym/widgets/icons/JFileChooser.jpg";//GEN-BEGIN:Icons
    private static String iconNameC32 = "/py/com/oym/widgets/icons/JFileChooser.jpg";
    private static String iconNameM16 = "/py/com/oym/widgets/icons/JFileChooser.jpg";
    private static String iconNameM32 = "/py/com/oym/widgets/icons/JFileChooser.jpg";//GEN-END:Icons

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
