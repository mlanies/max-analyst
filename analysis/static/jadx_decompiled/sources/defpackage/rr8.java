package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class rr8 extends dle implements Menu {
    public final wq8 o;

    public rr8(Context context, wq8 wq8Var) {
        super(context);
        if (wq8Var == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.o = wq8Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return M(this.o.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = M(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.o.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        qpd qpdVar = (qpd) this.c;
        if (qpdVar != null) {
            qpdVar.clear();
        }
        this.o.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.o.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return M(this.o.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return M(this.o.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.o.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.o.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.o.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((qpd) this.c) != null) {
            int i2 = 0;
            while (true) {
                qpd qpdVar = (qpd) this.c;
                if (i2 >= qpdVar.c) {
                    break;
                }
                if (((vde) qpdVar.f(i2)).getGroupId() == i) {
                    ((qpd) this.c).g(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.o.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((qpd) this.c) != null) {
            int i2 = 0;
            while (true) {
                qpd qpdVar = (qpd) this.c;
                if (i2 >= qpdVar.c) {
                    break;
                }
                if (((vde) qpdVar.f(i2)).getItemId() == i) {
                    ((qpd) this.c).g(i2);
                    break;
                }
                i2++;
            }
        }
        this.o.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.o.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.o.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.o.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.o.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.o.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return M(this.o.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.o.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return M(this.o.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.o.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return M(this.o.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.o.addSubMenu(i, i2, i3, i4);
    }
}
