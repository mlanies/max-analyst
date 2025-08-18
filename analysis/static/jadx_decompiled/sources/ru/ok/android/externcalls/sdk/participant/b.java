package ru.ok.android.externcalls.sdk.participant;

import defpackage.m56;
import defpackage.qod;
import defpackage.rj3;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ AddParticipantsCommands b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, AddParticipantsCommands addParticipantsCommands, int i) {
        this.a = i;
        this.c = obj;
        this.b = addParticipantsCommands;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                AddParticipantsCommands.AnonymousClass2.invoke$lambda$1((rj3) this.c, this.b, jSONObject);
                break;
            default:
                AddParticipantsCommands.C00391.invoke$lambda$5((m56) this.c, this.b, jSONObject);
                break;
        }
    }
}
