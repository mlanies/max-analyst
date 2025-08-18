package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class he0 implements k16 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final c q;
    public boolean r;
    public int s;

    public he0(c cVar) {
        cVar.J();
        z06 z06Var = cVar.w;
        if (z06Var != null) {
            z06Var.u0.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = cVar;
    }

    @Override // defpackage.k16
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(v16 v16Var) {
        this.a.add(v16Var);
        v16Var.d = this.b;
        v16Var.e = this.c;
        v16Var.f = this.d;
        v16Var.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                v16 v16Var = (v16) arrayList.get(i2);
                a aVar = v16Var.b;
                if (aVar != null) {
                    aVar.E0 += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(v16Var.b);
                        int i3 = v16Var.b.E0;
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new bt7());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        c cVar = this.q;
        if (z2) {
            this.s = cVar.j.getAndIncrement();
        } else {
            this.s = -1;
        }
        cVar.y(this, z);
        return this.s;
    }

    public final void e() {
        if (this.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.q.B(this, false);
    }

    public final void f(int i, a aVar, String str, int i2) {
        String str2 = aVar.b1;
        if (str2 != null) {
            u16.c(aVar, str2);
        }
        Class<?> cls = aVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = aVar.L0;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + aVar + ": was " + aVar.L0 + " now " + str);
            }
            aVar.L0 = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + aVar + " with tag " + str + " to container view with no id");
            }
            int i3 = aVar.J0;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + aVar + ": was " + aVar.J0 + " now " + i);
            }
            aVar.J0 = i;
            aVar.K0 = i;
        }
        b(new v16(i2, aVar));
        aVar.F0 = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v16 v16Var = (v16) arrayList.get(i);
            switch (v16Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + v16Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(v16Var.b);
            if (z) {
                if (v16Var.d != 0 || v16Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(v16Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(v16Var.e));
                }
                if (v16Var.f != 0 || v16Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(v16Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(v16Var.g));
                }
            }
        }
    }

    public final void h(a aVar) {
        c cVar = aVar.F0;
        if (cVar == null || cVar == this.q) {
            b(new v16(3, aVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void i(a aVar, fg7 fg7Var) {
        c cVar = aVar.F0;
        c cVar2 = this.q;
        if (cVar != cVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + cVar2);
        }
        if (fg7Var == fg7.b && aVar.a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + fg7Var + " after the Fragment has been created");
        }
        if (fg7Var == fg7.a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + fg7Var + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        v16 v16Var = new v16();
        v16Var.a = 10;
        v16Var.b = aVar;
        v16Var.c = false;
        v16Var.h = aVar.c1;
        v16Var.i = fg7Var;
        b(v16Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
