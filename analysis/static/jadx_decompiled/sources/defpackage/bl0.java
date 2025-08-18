package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class bl0 implements yk {
    public static final Uri X = sl.a("batch.executeV2");
    public final String a;
    public final il[] b;
    public final int c;
    public final gaa o;

    public bl0(String str, il[] ilVarArr, int i) {
        this.a = str;
        this.b = ilVarArr;
        this.c = i;
        this.o = new gaa(ilVarArr);
    }

    @Override // defpackage.yk
    public final za7 getOkParser() {
        return this.o;
    }

    @Override // defpackage.fl
    public final int getPriority() {
        int i = this.c;
        int i2 = 1;
        if (1 <= i && i < 257) {
            return i;
        }
        for (il ilVar : this.b) {
            int priority = ilVar.b.getPriority();
            if (i2 < priority) {
                i2 = priority;
            }
        }
        return i2;
    }

    @Override // defpackage.fl
    public final kl getScope() {
        il[] ilVarArr = this.b;
        int length = ilVarArr.length;
        kl klVar = kl.a;
        if (length == 0) {
            return klVar;
        }
        if (length == 1) {
            return ilVarArr[0].b.getScope();
        }
        for (il ilVar : ilVarArr) {
            kl scope = ilVar.b.getScope();
            if (klVar.compareTo(scope) < 0) {
                klVar = scope;
            }
            if (ilVar.b.getScopeAfter() != ll.a) {
                break;
            }
        }
        return klVar;
    }

    @Override // defpackage.yk
    public final ll getScopeAfter() {
        il[] ilVarArr = this.b;
        int length = ilVarArr.length;
        ll llVar = ll.a;
        if (length == 0) {
            return llVar;
        }
        if (length == 1) {
            return ilVarArr[0].b.getScopeAfter();
        }
        for (int i = length - 1; -1 < i; i--) {
            ll scopeAfter = ilVarArr[i].b.getScopeAfter();
            if (scopeAfter != llVar) {
                return scopeAfter;
            }
        }
        return llVar;
    }

    @Override // defpackage.fl
    public final Uri getUri() {
        return X;
    }

    @Override // defpackage.fl
    public final boolean shouldGzip() {
        for (il ilVar : this.b) {
            if (ilVar.b.shouldGzip()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fl
    public final boolean shouldPost() {
        return true;
    }

    @Override // defpackage.fl
    public final void writeParams(kb7 kb7Var) {
        String str = this.a;
        if (str != null) {
            kb7Var.g0("id");
            kb7Var.i(str);
        }
        kb7Var.g0("methods");
        kb7Var.u();
        for (il ilVar : this.b) {
            yk ykVar = ilVar.b;
            kb7Var.s();
            kb7Var.g0(ilVar.e);
            kb7Var.s();
            if (ykVar.willWriteParams()) {
                kb7Var.g0("params");
                kb7Var.s();
                ykVar.writeParams(kb7Var);
                kb7Var.q();
            }
            if (ykVar.willWriteSupplyParams()) {
                kb7Var.g0("supplyParams");
                kb7Var.s();
                ykVar.writeSupplyParams(kb7Var);
                kb7Var.q();
            }
            if (ilVar.c) {
                kb7Var.g0("onError");
                kb7Var.i("SKIP");
            }
            String str2 = ilVar.d;
            if (str2 != null) {
                kb7Var.g0("condition");
                kb7Var.i(str2);
            }
            kb7Var.q();
            kb7Var.q();
        }
        kb7Var.t();
    }
}
