package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class wq8 implements Menu {
    public static final int[] J0 = {1, 4, 5, 3, 2, 0};
    public br8 G0;
    public boolean I0;
    public uq8 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean o;
    public boolean s0;
    public final ArrayList t0;
    public final ArrayList u0;
    public boolean v0;
    public CharSequence x0;
    public Drawable y0;
    public View z0;
    public int w0 = 0;
    public boolean A0 = false;
    public boolean B0 = false;
    public boolean C0 = false;
    public boolean D0 = false;
    public final ArrayList E0 = new ArrayList();
    public final CopyOnWriteArrayList F0 = new CopyOnWriteArrayList();
    public boolean H0 = false;

    public wq8(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.s0 = true;
        this.t0 = new ArrayList();
        this.u0 = new ArrayList();
        this.v0 = true;
        if (resources.getConfiguration().keyboard != 1 && bnf.b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.o = z;
    }

    public final br8 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (J0[i5] << 16) | (65535 & i3);
        br8 br8Var = new br8(this, i, i2, i3, i6, charSequence, this.w0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((br8) arrayList.get(size)).o <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, br8Var);
        p(true);
        return br8Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            br8 br8VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            br8VarA.setIcon(resolveInfo.loadIcon(packageManager));
            br8VarA.Z = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = br8VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(or8 or8Var, Context context) {
        this.F0.add(new WeakReference(or8Var));
        or8Var.k(context, this);
        this.v0 = true;
    }

    public final void c(boolean z) {
        if (this.D0) {
            return;
        }
        this.D0 = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            or8 or8Var = (or8) weakReference.get();
            if (or8Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                or8Var.c(this, z);
            }
        }
        this.D0 = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        br8 br8Var = this.G0;
        if (br8Var != null) {
            d(br8Var);
        }
        this.Y.clear();
        p(true);
    }

    public final void clearHeader() {
        this.y0 = null;
        this.x0 = null;
        this.z0 = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(br8 br8Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.G0 == br8Var) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                or8 or8Var = (or8) weakReference.get();
                if (or8Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE = or8Var.e(br8Var);
                    if (zE) {
                        break;
                    }
                }
            }
            v();
            if (zE) {
                this.G0 = null;
            }
        }
        return zE;
    }

    public boolean e(wq8 wq8Var, MenuItem menuItem) {
        uq8 uq8Var = this.X;
        return uq8Var != null && uq8Var.z(wq8Var, menuItem);
    }

    public boolean f(br8 br8Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            or8 or8Var = (or8) weakReference.get();
            if (or8Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zH = or8Var.h(br8Var);
                if (zH) {
                    break;
                }
            }
        }
        v();
        if (zH) {
            this.G0 = br8Var;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8Var = (br8) arrayList.get(i2);
            if (br8Var.a == i) {
                return br8Var;
            }
            if (br8Var.hasSubMenu() && (menuItemFindItem = br8Var.z0.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final br8 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.E0;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (br8) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8Var = (br8) arrayList.get(i2);
            char c = zN ? br8Var.u0 : br8Var.s0;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return br8Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.Y.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.Y;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                br8 br8Var = (br8) arrayList.get(i2);
                if (br8Var.hasSubMenu()) {
                    br8Var.z0.h(list, i, keyEvent);
                }
                char c = zN ? br8Var.u0 : br8Var.s0;
                if ((modifiers & 69647) == ((zN ? br8Var.v0 : br8Var.t0) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && br8Var.isEnabled()) {
                        list.add(br8Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.I0) {
            return true;
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((br8) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.v0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zD = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                or8 or8Var = (or8) weakReference.get();
                if (or8Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= or8Var.d();
                }
            }
            ArrayList arrayList = this.t0;
            ArrayList arrayList2 = this.u0;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    br8 br8Var = (br8) arrayListL.get(i);
                    if (br8Var.f()) {
                        arrayList.add(br8Var);
                    } else {
                        arrayList2.add(br8Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.v0 = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public wq8 k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.s0;
        ArrayList arrayList = this.Z;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.Y;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            br8 br8Var = (br8) arrayList2.get(i);
            if (br8Var.isVisible()) {
                arrayList.add(br8Var);
            }
        }
        this.s0 = false;
        this.v0 = true;
        return arrayList;
    }

    public boolean m() {
        return this.H0;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.o;
    }

    public final void p(boolean z) {
        if (this.A0) {
            this.B0 = true;
            if (z) {
                this.C0 = true;
                return;
            }
            return;
        }
        if (z) {
            this.s0 = true;
            this.v0 = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            or8 or8Var = (or8) weakReference.get();
            if (or8Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                or8Var.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        br8 br8VarG = g(i, keyEvent);
        boolean zQ = br8VarG != null ? q(br8VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, defpackage.or8 r8, int r9) {
        /*
            r6 = this;
            br8 r7 = (defpackage.br8) r7
            r0 = 0
            if (r7 == 0) goto Lc4
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc4
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.A0
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L39
        L1a:
            wq8 r1 = r7.y0
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.Z
            if (r3 == 0) goto L2d
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            k7 r1 = r7.L0
            if (r1 == 0) goto L38
            boolean r1 = r1.e()
            if (r1 == 0) goto L38
            goto L18
        L38:
            r1 = r0
        L39:
            k7 r3 = r7.L0
            if (r3 == 0) goto L45
            boolean r4 = r3.a()
            if (r4 == 0) goto L45
            r4 = r2
            goto L46
        L45:
            r4 = r0
        L46:
            boolean r5 = r7.e()
            if (r5 == 0) goto L58
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc3
            r6.c(r2)
            goto Lc3
        L58:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L69
            if (r4 == 0) goto L61
            goto L69
        L61:
            r7 = r9 & 1
            if (r7 != 0) goto Lc3
            r6.c(r2)
            goto Lc3
        L69:
            r9 = r9 & 4
            if (r9 != 0) goto L70
            r6.c(r0)
        L70:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L84
            qae r9 = new qae
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.z0 = r9
            java.lang.CharSequence r5 = r7.X
            r9.setHeaderTitle(r5)
        L84:
            qae r7 = r7.z0
            if (r4 == 0) goto L8b
            r3.f(r7)
        L8b:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.F0
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L94
            goto Lbd
        L94:
            if (r8 == 0) goto L9a
            boolean r0 = r8.b(r7)
        L9a:
            java.util.Iterator r8 = r9.iterator()
        L9e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            or8 r4 = (defpackage.or8) r4
            if (r4 != 0) goto Lb6
            r9.remove(r3)
            goto L9e
        Lb6:
            if (r0 != 0) goto L9e
            boolean r0 = r4.b(r7)
            goto L9e
        Lbd:
            r1 = r1 | r0
            if (r1 != 0) goto Lc3
            r6.c(r2)
        Lc3:
            return r1
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq8.q(android.view.MenuItem, or8, int):boolean");
    }

    public final void r(or8 or8Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.F0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            or8 or8Var2 = (or8) weakReference.get();
            if (or8Var2 == null || or8Var2 == or8Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((br8) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((br8) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.Y;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((br8) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.Y;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((qae) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8Var = (br8) arrayList.get(i2);
            if (br8Var.b == i) {
                br8Var.I0 = (br8Var.I0 & (-5)) | (z2 ? 4 : 0);
                br8Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.H0 = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8Var = (br8) arrayList.get(i2);
            if (br8Var.b == i) {
                br8Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            br8 br8Var = (br8) arrayList.get(i2);
            if (br8Var.b == i) {
                int i3 = br8Var.I0;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                br8Var.I0 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.Y.size();
    }

    public final void t(Bundle bundle) {
        int size = this.Y.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((qae) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.z0 = view;
            this.x0 = null;
            this.y0 = null;
        } else {
            if (i > 0) {
                this.x0 = this.b.getText(i);
            } else if (charSequence != null) {
                this.x0 = charSequence;
            }
            if (i2 > 0) {
                this.y0 = kt3.b(this.a, i2);
            } else if (drawable != null) {
                this.y0 = drawable;
            }
            this.z0 = null;
        }
        p(false);
    }

    public final void v() {
        this.A0 = false;
        if (this.B0) {
            this.B0 = false;
            p(this.C0);
        }
    }

    public final void w() {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.B0 = false;
        this.C0 = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        br8 br8VarA = a(i, i2, i3, charSequence);
        qae qaeVar = new qae(this.a, this, br8VarA);
        br8VarA.z0 = qaeVar;
        qaeVar.setHeaderTitle(br8VarA.X);
        return qaeVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
