package ru.ok.android.externcalls.sdk.asr.internal.commands;

import defpackage.k56;
import defpackage.m56;
import defpackage.zad;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JG\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000e\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/commands/AsrCommandsExecutor;", "", "", "fileName", "Lzad;", "sessionRoomId", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Ljava/lang/String;Lzad;Lk56;Lm56;)V", "stopRecord", "(Lzad;Lk56;Lm56;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface AsrCommandsExecutor {
    void startRecord(String fileName, zad sessionRoomId, k56 onSuccess, m56 onError);

    void stopRecord(zad sessionRoomId, k56 onSuccess, m56 onError);
}
