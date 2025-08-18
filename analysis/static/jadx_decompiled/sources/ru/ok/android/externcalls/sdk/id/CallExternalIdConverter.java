package ru.ok.android.externcalls.sdk.id;

import defpackage.o61;

/* loaded from: classes2.dex */
public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    public static ParticipantId convert(o61 o61Var) {
        if (o61Var == null) {
            return null;
        }
        return new ParticipantId(o61Var.a, o61Var.b == 3, o61Var.c);
    }
}
