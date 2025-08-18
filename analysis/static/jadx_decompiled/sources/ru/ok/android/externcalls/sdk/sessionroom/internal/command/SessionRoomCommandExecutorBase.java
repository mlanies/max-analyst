package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.m56;
import defpackage.tpa;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomInactiveException;
import ru.ok.android.externcalls.sdk.sessionroom.exceptions.SessionRoomNotAdminException;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "", "<init>", "()V", "", "method", "Lorg/json/JSONObject;", "errorResponse", "Lkotlin/Function1;", "", "Le5f;", "onError", "parseErrorResponse", "(Ljava/lang/String;Lorg/json/JSONObject;Lm56;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class SessionRoomCommandExecutorBase {
    public final void parseErrorResponse(String method, JSONObject errorResponse, m56 onError) {
        Object sessionRoomException;
        if (onError != null) {
            String strOptString = errorResponse.optString("error");
            if (tpa.f(strOptString, "rooms.roomInactive")) {
                sessionRoomException = new SessionRoomInactiveException();
            } else if (tpa.f(strOptString, "rooms.notAdmin")) {
                sessionRoomException = new SessionRoomNotAdminException();
            } else {
                sessionRoomException = new SessionRoomException("Error response for " + method + " command " + errorResponse, null, 2, null);
            }
            onError.invoke(sessionRoomException);
        }
    }
}
