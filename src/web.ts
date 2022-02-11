import { WebPlugin } from '@capacitor/core';

import type { SunmiRFIDPlugin } from './definitions';

export class SunmiRFIDWeb extends WebPlugin implements SunmiRFIDPlugin {
   async connect(): Promise<{ status: string; data: string; }> {
      return Promise.reject("Piattaforma non supportata");
   }
   async disconnect(): Promise<{ status: string; data: string }> {
      return Promise.reject("Piattaforma non supportata");
   }
   async getScanModel(): Promise<{ status: string; data: string; }> {
      return Promise.reject("Piattaforma non supportata");
   }
   // @ts-ignore
   async getInfo(callback:any): Promise<number> {
      return Promise.reject("Piattaforma non supportata");
   }
   // @ts-ignore
   async getBatteryRemainingPercent(callback:any): Promise<number> {
      return Promise.reject("Piattaforma non supportata");
   }
   // @ts-ignore
   async onReadTag(callback:any): Promise<number> {
      return Promise.reject("Piattaforma non supportata");
   }
}
