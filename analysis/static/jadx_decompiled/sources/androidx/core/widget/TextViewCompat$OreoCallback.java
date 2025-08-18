package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
class TextViewCompat$OreoCallback implements ActionMode.Callback {
    private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
    private final ActionMode.Callback mCallback;
    private boolean mCanUseMenuBuilderReferences;
    private boolean mInitializedMenuBuilderReferences = false;
    private Class<?> mMenuBuilderClass;
    private Method mMenuBuilderRemoveItemAtMethod;
    private final TextView mTextView;

    public TextViewCompat$OreoCallback(ActionMode.Callback callback, TextView textView) {
        this.mCallback = callback;
        this.mTextView = textView;
    }

    private Intent createProcessTextIntent() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(HTTP.PLAIN_TEXT_TYPE);
    }

    private Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo, TextView textView) {
        Intent intentPutExtra = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !isEditable(textView));
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    private List<ResolveInfo> getSupportedActivities(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        if (!(context instanceof Activity)) {
            return arrayList;
        }
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(createProcessTextIntent(), 0)) {
            if (isSupportedActivity(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    private boolean isEditable(TextView textView) {
        return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
    }

    private boolean isSupportedActivity(ResolveInfo resolveInfo, Context context) {
        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
            return true;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    private void recomputeProcessTextMenuItems(Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Context context = this.mTextView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.mInitializedMenuBuilderReferences) {
            this.mInitializedMenuBuilderReferences = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.mMenuBuilderClass = cls;
                this.mMenuBuilderRemoveItemAtMethod = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.mCanUseMenuBuilderReferences = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.mMenuBuilderClass = null;
                this.mMenuBuilderRemoveItemAtMethod = null;
                this.mCanUseMenuBuilderReferences = false;
            }
        }
        try {
            Method declaredMethod = (this.mCanUseMenuBuilderReferences && this.mMenuBuilderClass.isInstance(menu)) ? this.mMenuBuilderRemoveItemAtMethod : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            List<ResolveInfo> supportedActivities = getSupportedActivities(context, packageManager);
            for (int i = 0; i < supportedActivities.size(); i++) {
                ResolveInfo resolveInfo = supportedActivities.get(i);
                menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(createProcessTextIntentForResolveInfo(resolveInfo, this.mTextView)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }

    public ActionMode.Callback getWrappedCallback() {
        return this.mCallback;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.mCallback.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.mCallback.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        recomputeProcessTextMenuItems(menu);
        return this.mCallback.onPrepareActionMode(actionMode, menu);
    }
}
