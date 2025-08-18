package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import defpackage.fp3;

/* loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        fp3.k(str, "Detail message must not be empty");
    }
}
