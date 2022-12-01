export class FileDeleteResponse {
  id: number;
  successful: boolean;
  message: string;


  constructor(id: number, successful: boolean, message: string) {
    this.id = id;
    this.successful = successful;
    this.message = message;
  }
}
