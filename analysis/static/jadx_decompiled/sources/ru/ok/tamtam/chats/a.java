package ru.ok.tamtam.chats;

import defpackage.av0;
import defpackage.ci0;
import defpackage.kke;

/* loaded from: classes2.dex */
public abstract class a {
    public static final ci0 a(av0 av0Var, kke kkeVar) {
        ChatsEventsByBus chatsEventsByBus = new ChatsEventsByBus(kkeVar);
        av0Var.d(chatsEventsByBus);
        return chatsEventsByBus;
    }
}
