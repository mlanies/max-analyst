package defpackage;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes2.dex */
public final class ira implements ActionMode.Callback {
    public final Context a;
    public final g17 b;
    public final int c;
    public final int d;

    public ira(Context context, g17 g17Var, int i, int i2) {
        this.a = context;
        this.b = g17Var;
        this.c = i;
        this.d = i2;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence charSequenceB;
        Integer numValueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (numValueOf == null || numValueOf.intValue() != 16908322 || (charSequenceB = tpa.B(this.a)) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequenceB.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequenceB.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = w9e.X0(this.d, sb).toString();
        ((jg3) this.b).J0(this.c, string);
        return string.length() > 0;
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
