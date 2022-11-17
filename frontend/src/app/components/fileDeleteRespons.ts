export class FileDeleteRespons {
  id: number;
  sucess: boolean;
  message: string;


  constructor(id: number, sucess: boolean, message: string) {
    this.id = id;
    this.sucess = sucess;
    this.message = message;
  }
}
