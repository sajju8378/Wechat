# Wechat — Simple E2EE Text Messenger

A minimal one-to-one end-to-end encrypted text messenger. Version 1 intentionally excludes calls, video, status, groups, stories, media, and payments.

## Scope
- ID-only user discovery
- Local identity key generation
- Public-key directory
- One-to-one encrypted text messaging
- WebSocket relay
- Android application build via GitHub Actions

## Security direction
The server is designed to relay ciphertext rather than plaintext. This repository is an engineering prototype and is not yet a security-audited messenger. Before production use, the protocol must be hardened with authenticated device ownership, forward secrecy / ratcheting, key verification, encrypted local storage, abuse controls, and independent security review.

## Build
The Android project lives under `apps/android`. GitHub Actions builds a debug APK and publishes it as a workflow artifact.
