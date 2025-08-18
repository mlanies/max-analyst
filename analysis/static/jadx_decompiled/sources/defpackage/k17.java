package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class k17 extends InputConnectionWrapper {
    public final /* synthetic */ z16 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k17(InputConnection inputConnection, z16 z16Var) {
        super(inputConnection, false);
        this.a = z16Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ey1 ey1Var;
        if (inputContentInfo == null) {
            ey1Var = null;
        } else {
            wmc wmcVar = new wmc();
            wmcVar.a = inputContentInfo;
            ey1Var = new ey1(18, wmcVar);
        }
        if (this.a.g(ey1Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
