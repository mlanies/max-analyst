package ru.ok.tamtam.errors;

import defpackage.pke;

/* loaded from: classes2.dex */
public class TamErrorException extends Exception {
    public final pke a;

    public TamErrorException(pke pkeVar) {
        super(pkeVar.b);
        this.a = pkeVar;
    }
}
