package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.ba0;
import defpackage.h02;
import defpackage.hz3;
import defpackage.k2f;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public k2f create(hz3 hz3Var) {
        Context context = ((ba0) hz3Var).a;
        ba0 ba0Var = (ba0) hz3Var;
        return new h02(context, ba0Var.b, ba0Var.c);
    }
}
