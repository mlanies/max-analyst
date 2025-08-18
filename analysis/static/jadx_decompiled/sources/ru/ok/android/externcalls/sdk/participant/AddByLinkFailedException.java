package ru.ok.android.externcalls.sdk.participant;

import defpackage.u25;
import defpackage.v25;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "reason", "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "(Ljava/lang/String;Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;)V", "getReason", "()Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "Reason", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddByLinkFailedException extends RuntimeException {
    private final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException$Reason;", "", "(Ljava/lang/String;I)V", "LINK_OUTDATED", "WRONG_SIGNATURE", "MALFORMED_QR_URL", "QR_WRONG_PREFIX", "QR_NO_USER_ID_PARAMETER", "QR_GENERAL_ERROR", "UNKNOWN", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Reason {
        private static final /* synthetic */ u25 $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason LINK_OUTDATED = new Reason("LINK_OUTDATED", 0);
        public static final Reason WRONG_SIGNATURE = new Reason("WRONG_SIGNATURE", 1);
        public static final Reason MALFORMED_QR_URL = new Reason("MALFORMED_QR_URL", 2);
        public static final Reason QR_WRONG_PREFIX = new Reason("QR_WRONG_PREFIX", 3);
        public static final Reason QR_NO_USER_ID_PARAMETER = new Reason("QR_NO_USER_ID_PARAMETER", 4);
        public static final Reason QR_GENERAL_ERROR = new Reason("QR_GENERAL_ERROR", 5);
        public static final Reason UNKNOWN = new Reason("UNKNOWN", 6);

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{LINK_OUTDATED, WRONG_SIGNATURE, MALFORMED_QR_URL, QR_WRONG_PREFIX, QR_NO_USER_ID_PARAMETER, QR_GENERAL_ERROR, UNKNOWN};
        }

        static {
            Reason[] reasonArr$values = $values();
            $VALUES = reasonArr$values;
            $ENTRIES = new v25(reasonArr$values);
        }

        private Reason(String str, int i) {
        }

        public static u25 getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public AddByLinkFailedException(String str, Reason reason) {
        super(str);
        this.reason = reason;
    }

    public final Reason getReason() {
        return this.reason;
    }
}
