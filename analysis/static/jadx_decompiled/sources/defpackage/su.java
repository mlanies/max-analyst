package defpackage;

/* loaded from: classes2.dex */
public final class su extends pi0 {
    public final /* synthetic */ int b;

    @Override // defpackage.pi0
    public String toString() {
        switch (this.b) {
            case 0:
                return "AssetsUpdateEvent{chatId=0}";
            case 1:
                return "AudioRecordLimitEvent{}";
            case 3:
                return "ContactSortEvent";
            case 10:
                return "PhonesSortEvent";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ su(long j, int i) {
        super(j);
        this.b = i;
    }
}
