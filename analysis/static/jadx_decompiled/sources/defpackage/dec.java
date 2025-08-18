package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class dec {
    public static final List E0 = Collections.emptyList();
    public RecyclerView C0;
    public hdc D0;
    public final View a;
    public WeakReference b;
    public int u0;
    public int c = -1;
    public int o = -1;
    public long X = -1;
    public int Y = -1;
    public int Z = -1;
    public dec s0 = null;
    public dec t0 = null;
    public ArrayList v0 = null;
    public List w0 = null;
    public int x0 = 0;
    public vdc y0 = null;
    public boolean z0 = false;
    public int A0 = 0;
    public int B0 = -1;

    public dec(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view;
    }

    public final void f(int i) {
        this.u0 = i | this.u0;
    }

    public final int g() {
        RecyclerView recyclerView = this.C0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.P(this);
    }

    public final int h() {
        RecyclerView recyclerView;
        hdc adapter;
        int iP;
        if (this.D0 == null || (recyclerView = this.C0) == null || (adapter = recyclerView.getAdapter()) == null || (iP = this.C0.P(this)) == -1) {
            return -1;
        }
        return adapter.i(this.D0, this, iP);
    }

    public final int i() {
        int i = this.Z;
        return i == -1 ? this.c : i;
    }

    public final List j() {
        ArrayList arrayList;
        return ((this.u0 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 || (arrayList = this.v0) == null || arrayList.size() == 0) ? E0 : this.w0;
    }

    public final boolean k(int i) {
        return (this.u0 & i) != 0;
    }

    public final boolean l() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.C0) ? false : true;
    }

    public final boolean m() {
        return (this.u0 & 1) != 0;
    }

    public final boolean n() {
        return (this.u0 & 4) != 0;
    }

    public final boolean o() {
        if ((this.u0 & 16) == 0) {
            WeakHashMap weakHashMap = zmf.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        return (this.u0 & 8) != 0;
    }

    public final boolean q() {
        return this.y0 != null;
    }

    public final boolean r() {
        return (this.u0 & 256) != 0;
    }

    public final boolean s() {
        return (this.u0 & 2) != 0;
    }

    public final void t(int i, boolean z) {
        if (this.o == -1) {
            this.o = this.c;
        }
        if (this.Z == -1) {
            this.Z = this.c;
        }
        if (z) {
            this.Z += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((pdc) view.getLayoutParams()).c = true;
        }
    }

    public final String toString() {
        StringBuilder sbO = rh4.o(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbO.append(Integer.toHexString(hashCode()));
        sbO.append(" position=");
        sbO.append(this.c);
        sbO.append(" id=");
        sbO.append(this.X);
        sbO.append(", oldPos=");
        sbO.append(this.o);
        sbO.append(", pLpos:");
        sbO.append(this.Z);
        StringBuilder sb = new StringBuilder(sbO.toString());
        if (q()) {
            sb.append(" scrap ");
            sb.append(this.z0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (n()) {
            sb.append(" invalid");
        }
        if (!m()) {
            sb.append(" unbound");
        }
        if ((this.u0 & 2) != 0) {
            sb.append(" update");
        }
        if (p()) {
            sb.append(" removed");
        }
        if (w()) {
            sb.append(" ignored");
        }
        if (r()) {
            sb.append(" tmpDetached");
        }
        if (!o()) {
            sb.append(" not recyclable(" + this.x0 + ")");
        }
        if ((this.u0 & 512) != 0 || n()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        if (RecyclerView.L1 && r()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.u0 = 0;
        this.c = -1;
        this.o = -1;
        this.X = -1L;
        this.Z = -1;
        this.x0 = 0;
        this.s0 = null;
        this.t0 = null;
        ArrayList arrayList = this.v0;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.u0 &= -1025;
        this.A0 = 0;
        this.B0 = -1;
        RecyclerView.o(this);
    }

    public final void v(boolean z) {
        int i = this.x0;
        int i2 = z ? i - 1 : i + 1;
        this.x0 = i2;
        if (i2 < 0) {
            this.x0 = 0;
            if (RecyclerView.L1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z && i2 == 1) {
            this.u0 |= 16;
        } else if (z && i2 == 0) {
            this.u0 &= -17;
        }
        if (RecyclerView.M1) {
            toString();
        }
    }

    public final boolean w() {
        return (this.u0 & 128) != 0;
    }

    public final boolean y() {
        return (this.u0 & 32) != 0;
    }
}
