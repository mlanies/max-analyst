package defpackage;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes2.dex */
public final class hra implements ActionMode.Callback {
    public final Context a;
    public final m56 b;

    public hra(Context context, wz7 wz7Var) {
        this.a = context;
        this.b = wz7Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 16908322) {
            return ((Boolean) this.b.invoke(tpa.B(this.a))).booleanValue();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.paste);
        if (menuItemFindItem == null) {
            return false;
        }
        menu.clear();
        menu.add(0, R.id.paste, 0, menuItemFindItem.getTitle());
        return true;
    }
}
